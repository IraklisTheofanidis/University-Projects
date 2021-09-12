TITLE ASKISI3
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA
ARXH:
	    MOV AX,DEDOMENA ; Apokatastash tou DS
	    MOV DS,AX	; Apokatastash tou DS    
	    
	    MOV SI,0	             
	   
    
V1:	    LEA DX,PROTROPI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H	

V2:	   	
	    MOV AH,08H    	; Eisagoume xarakthra apo to plhktrologio me parallhlh emfanish
	    INT 21H		; H ASCII timh tou xarakthra apothikeuetai ston AL
        
        MOV BUFFER2[SI],AL
        INC SI
        CMP SI,4  
        
         MOV AH,2
        MOV DL,64
        INT 21H
        
        JNE V2
        
        MOV CX,SI
        MOV SI,0
        EPANALIPSI:
        MOV AL,BUFFER[SI]
        MOV BL,BUFFER2[SI] 
            CMP AL,BL
            JNE  TPT
           
            INC SI
        
        LOOP EPANALIPSI
        
         LEA DX,MESSAGE
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H 
        
  
	    
	 JMP EXIT   
	   

 TPT:
     LEA DX,AKIRO
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H         
	   
EXIT:	    
           MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
    	    INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
	BUFFER   DB 'C','O','D','E','$' ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte    
	BUFFER2   DB 40 DUP(0) 
       PROTROPI DB 'DWSE TON KODIKO:  ',10,13,'$';
	MESSAGE  DB 10,13,10,13,'EGKIROS KODIKOS:',10,13,'$' ; To minima pou tha emfanistei
	MESSAGE2  DB 10,13,10,13,'OLOI OI ZIGOI ANAPODA:',10,13,'$'
	AKIRO  DB 10,13,'LATHOS KODIKOS $';						
DEDOMENA ENDS

	END ARXH