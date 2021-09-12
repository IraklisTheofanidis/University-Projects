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
      
      CMP AL,'*'
      JE EMFANISI
        
     CMP AL,65
     JB BEEP
     
     CMP AL,90
     JA BEEP  
     
      MOV DL,AL
      MOV AH,2
      INT 21H
     
     
     MOV BUFFER2[SI],AL
  
	  INC SI
	  CMP SI,5
	  JNE V2
	    
	 JMP EMFANISI   


BEEP:
        MOV AH,2
        MOV DL,07
        INT 21H
        JMP V2
	   
   
  EMFANISI: 
  
    
      MOV AH,2 
      MOV DL,42
      INT 21H  
      
     
      
       
      
       LEA DX,ASKISI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H 
	    
	    MOV AH,0
	    MOV AL,BUFFER2[0] 
	    MOV DL,AL
	    MOV AH,2
	    INT 21H 
	    
	    MOV AH,2
        MOV DL,10
        INT 21H  
        
         MOV AH,2
        MOV DL,13
        INT 21H
        
      MOV CX,SI
      MOV SI,1     
	   
      
   EPANALIPSI:
        
        
       
       
        MOV BX,CX
        MOV CX,SI
      
      
      CMP BX,1
      JE SINEXEIA 
       EPANALIPSI2:
       MOV AH,2
        MOV DL,35
        INT 21H
        
	    LOOP EPANALIPSI2  
	    
	     
	     
	    MOV AL,BUFFER2[SI] 
	    MOV DL,AL
	    MOV AH,2
        INT 21H
        
         MOV AH,2
        MOV DL,10
        INT 21H 
        
        MOV AH,2
        MOV DL,13
        INT 21H
        
     SINEXEIA:
        MOV CX,BX    
        INC SI
	    
	   LOOP EPANALIPSI 
        
            
   
   
 
EXIT:	    
           MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
    	    INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
	BUFFER   DB 'C','O','D','E','$' ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte    
	BUFFER2   DB 5 DUP(0) 
       PROTROPI DB 'DWSE TON KODIKO:  ',10,13,'$';
	MESSAGE  DB 10,13,10,13,'EGKIROS KODIKOS:',10,13,'$' ; To minima pou tha emfanistei
	MESSAGE2  DB 10,13,10,13,'OLOI OI ZIGOI ANAPODA:',10,13,'$'
	ASKISI  DB 10,13,'TO ZITOUMENO ',10,13,'$';						
DEDOMENA ENDS

	END ARXH