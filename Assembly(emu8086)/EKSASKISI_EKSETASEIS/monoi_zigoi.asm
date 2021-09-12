TITLE ASKISI3
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA,SS:SOROS
    KYRIO PROC NEAR
    
	    MOV AX,DEDOMENA ; Apokatastash tou DS
	    MOV DS,AX	; Apokatastash tou DS    
	
	 MOV SI,0      ; ARTIOS
	 MOV DI,0       ;      PERITTOS
        
     CALL YPO1   
     MOV NUM1,DL
     
     MOV DL,10
     MOV AH,2
     INT 21H  
     
     MOV DL,13
     MOV AH,2
     INT 21H 
      
     CALL YPO1
     MOV NUM2,DL  
     
      MOV AL,NUM1
      MOV AH,0
     MOV BL,2
     DIV BL 
     CMP AH,0 
     JE ARTIOS
     INC DI  
     JMP SINEXEIA
     
     ARTIOS:
     INC SI 
     
     SINEXEIA:
     
     MOV AL,NUM2
     MOV AH,0
     MOV BL,2
     DIV BL
     CMP AH,0
     JE ARTIOS2
     INC DI 
     JMP SINEXEIA2
     
     ARTIOS2:
     INC SI
     
     SINEXEIA2:
     
     CMP SI,2
     JE ZIGOI
     
     CMP DI,2
     JE MONOI 
    
    
     LEA DX,DIAFORETIKOI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
     
        MOV BL,NUM1
        MOV BH,NUM2
        
        CMP BL,BH
        JA EMF2 
        MOV DL,BH
        MOV AH,2
        INT 21H
        JMP TE
        
        
       EMF2:
        MOV DL,BL
        MOV AH,2
        INT 21H
        JMP TE 
     
     
     ZIGOI:
      LEA DX,ZIGOI1
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H	
	    JMP IDIA
	    
	  MONOI:
	   LEA DX,MONOI1
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H	  
     
     
     IDIA:    
     MOV BL,NUM1
     MOV BH,NUM2
     CMP BL,BH
     JB EMF
     MOV DL,BH
     MOV AH,2
     INT 21H
     JMP TE
     
     EMF: 
        MOV DL,BL
        MOV AH,2
        INT 21H
         
        JMP TE 
  
    TE: 
     MOV AH,4CH
     INT 21H
     
   KYRIO ENDP
  
   
  YPO1 PROC 
V1:  LEA DX,PROTROPI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H	

V2:	   	
	    MOV AH,08H    	; Eisagoume xarakthra apo to plhktrologio me parallhlh emfanish
	    INT 21H	
	    
	    CMP AL,48
	    JB BEEP
	    
	    CMP AL,57
	    JA BEEP
        
        MOV DL,AL
        MOV AH,2
        INT 21H
 
   
   JMP EXIT       
	   
BEEP:
        MOV AH,2
        MOV DL,07
        INT 21H
        JMP V2
       
	   
EXIT:	    
     RET
YPO1 ENDP

KODIKAS ENDS

DEDOMENA SEGMENT   
    NUM1 DB 0
    NUM2 DB 0
    
	BUFFER   DB 40 DUP(0) ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte    
	BUFFER2   DB 40 DUP(0) 
       PROTROPI DB 'DWSE MEXRI 10 MONOPSIFIOUS ARITHMOUS:  ',10,13,'$';
	ZIGOI1  DB 10,13,10,13,'EINAI KAI OI DIO ZIGOI KAI O MIKROTEROS EINAI: ',10,13,'$' ; To minima pou tha emfanistei
	MONOI1  DB 10,13,10,13,'EINAI KAI OI DIO MONOI KAI O MIKROTEROS EINAI',10,13,'$' 
	DIAFORETIKOI  DB 10,13,10,13,'O ENAS EINAI MONOS KAI O ALLOS ZIGOS KAI O MEGALITEROS EINAI O:',10,13,'$'
	NOINPUT  DB 10,13,'Den eisagate kanena ARITHMO. Telos programmatos$';						
DEDOMENA ENDS


SOROS SEGMENT STACK
	DB 256 DUP(0)
SOROS ENDS
	
	END KYRIO