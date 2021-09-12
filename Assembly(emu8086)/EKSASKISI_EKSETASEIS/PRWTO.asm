TITLE ASKISI3
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA
ARXH:
	    MOV AX,DEDOMENA ; Apokatastash tou DS
	    MOV DS,AX	; Apokatastash tou DS    
	    
	    MOV SI,0	             
	    MOV DI,0
    
V1:	    LEA DX,PROTROPI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H	

V2:	   	
	    MOV AH,08H    	; Eisagoume xarakthra apo to plhktrologio me parallhlh emfanish
	    INT 21H		; H ASCII timh tou xarakthra apothikeuetai ston AL
        
        CMP AL,'#'
        JE EMFANISI
              
        CMP AL,'0'
        JB BEEP
        
        CMP AL,'9'
        JA BEEP   
        
        MOV DL,AL
        MOV AH,2
        INT 21H  
        
        MOV BUFFER[SI],AL 
        MOV DL,AL 
         
        MOV AH,0 
        MOV BL,2
        DIV BL
        CMP AH,0
        JNE SINEXEIA 
        MOV BUFFER2[DI],DL
        INC DI
        
         
        
                
    SINEXEIA:          
        INC SI      
        CMP SI,5
        JNE V2
        
 EMFANISI:
         MOV CX,SI     
         JCXZ TPT 
         SUB SI,1
       
        LEA DX,MESSAGE
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H  
          
  EPANALIPSI: 
         MOV AL,BUFFER[SI]
        
         MOV DL,AL
        MOV AH,2
        INT 21H  
        
        SUB SI,1
        LOOP EPANALIPSI 
          
                  
	      
	     
	  
	     MOV CX,DI
	     MOV DI,0
	    
	   LEA DX,MESSAGE2
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H   
	     
	EPANALIPSI2:
	    MOV AL,BUFFER2[DI]
	   
	     MOV DL,AL
        MOV AH,2
        INT 21H
	    
	     INC DI
	    LOOP EPANALIPSI2  
	    
	    
	 JMP EXIT   
	   
BEEP:
        MOV AH,2
        MOV DL,07
        INT 21H
        JMP V2
 
 
 TPT:
     LEA DX,NOINPUT
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H         
	   
EXIT:	    
           MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
    	    INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
	BUFFER   DB 40 DUP(0) ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte    
	BUFFER2   DB 40 DUP(0) 
       PROTROPI DB 'DWSE MEXRI 10 MONOPSIFIOUS ARITHMOUS:  ',10,13,'$';
	MESSAGE  DB 10,13,10,13,'OLOI OI ARITHMOI ANAPODA:',10,13,'$' ; To minima pou tha emfanistei
	MESSAGE2  DB 10,13,10,13,'OLOI OI ZIGOI ANAPODA:',10,13,'$'
	NOINPUT  DB 10,13,'Den eisagate kanena ARITHMO. Telos programmatos$';						
DEDOMENA ENDS

	END ARXH