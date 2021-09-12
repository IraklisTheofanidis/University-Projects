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
	    MOV AH,01H    	; Eisagoume xarakthra apo to plhktrologio me parallhlh emfanish
	    INT 21H		; H ASCII timh tou xarakthra apothikeuetai ston AL
       
       CMP AL,35
       JE EMFANISI
       
       CMP AL,32
       JE APOTH 
       
       CMP AL,65
       JB V2
       
       CMP AL,91
       JB APOTH
       
       CMP AL,97
       JB V2
       
       CMP AL,123
       JAE V2
       
 APOTH:
    MOV BUFFER2[SI], AL
    INC SI
    CMP SI,20
    JNE V2
         
       
      
  EMFANISI:
         
    MOV CX,SI     
    JCXZ TPT   
    
    MOV SI,0
    MOV BL,0
   
    EPANALIPSI:
       MOV AL,BUFFER2[SI]
       CMP AL,32
       JNE SINEXEIA
       ADD AL,10
       ADD AL,BL
        INC BL
        
        
        MOV DL,AL      
        MOV AH,2
        INT 21H
        JMP TELOS
       
       
       SINEXEIA:  
         CMP AL,97
         JB KEFALAIA
         MOV AH,0
         
         MOV DL,4
         DIV DL
         ADD AL, 47
         MOV DL,AL
         MOV AH,2
         INT 21H
         
         JMP TELOS
          
       
       
       KEFALAIA:
            MOV AH,0 
            
            MOV DL,2
            DIV DL  
            ADD AL,68
            MOV DL,AL
            MOV AH,2
            INT 21H  
            
         TELOS:     
         
         INC SI
           
        
        LOOP EPANALIPSI 
     
     JMP EXIT       
   
 TPT:      
    LEA DX,NOINPUT
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
 
      
 
EXIT:	    
           MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
    	    INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
	; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte    
	BUFFER2   DB 5 DUP(0) 
       PROTROPI DB 'DWSE TON KODIKO:  ',10,13,'$';
	MESSAGE  DB 10,13,10,13,'EGKIROS KODIKOS:',10,13,'$' ; To minima pou tha emfanistei
	MESSAGE2  DB 10,13,10,13,'OLOI OI ZIGOI ANAPODA:',10,13,'$'
	NOINPUT  DB 10,13,'TPT ',10,13,'$';						
DEDOMENA ENDS

	END ARXH



