TITLE ASKISI3
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA,SS:SOROS
    KYRIO PROC NEAR
    
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
        
        CMP AL,'*'
        JE KLISI
        
        CMP AL,65
        JB V2
        
        CMP AL,91
        JB SINEXEIA
        
        CMP AL,97 
        JB V2
        
        CMP AL,123
        JAE V2
        
   SINEXEIA: 
   
    MOV BUFFER[SI],AL 
    MOV DL,AL
    MOV AH,2
    INT 21H
    
    INC SI
    CMP SI,5
    JNE V2
              
   KLISI:
     CALL YPO1 
     
     MOV AH,4CH
     INT 21H
     
   KYRIO ENDP
   
   
   
  YPO1 PROC 
   
     
   MOV CX,SI
   JCXZ TPT
   
   LEA DX,PLITHOS
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H	
   
   MOV AX,SI 
   
   MOV BL,10
   DIV BL
   MOV BX,AX
   
   
   
   
   MOV DL,BL 
   ADD DL,48
   MOV AH,2
   INT 21H
   
   MOV DL,BH
   ADD DL,48
   MOV AH,2
   INT 21H 
   
   LEA DX,MEGALITERA
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
   
   
  SUB SI,1
  MOV AL,BUFFER[SI]
  MOV CX,SI
  MOV SI,0  
  MOV DI,0   
  
    
   EPANALIPSI1:
        MOV BL,BUFFER[SI]
        CMP BL,AL
        JA EMF
         MOV BUFFER2[DI],BL 
         INC DI
         JMP AUKSISI 
         
    EMF:
       MOV DL,BL 
        MOV AH,2
        INT 21H  
           
        
    AUKSISI:
        INC SI          
   
   
   LOOP EPANALIPSI1  
   
   
   LEA DX,MIKROTERA
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
   
   
   MOV CX,DI
   MOV DI,0
   EPANALIPSI2:
    MOV DL,BUFFER2[DI]
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
     RET
YPO1 ENDP

KODIKAS ENDS

DEDOMENA SEGMENT
	BUFFER   DB 40 DUP(0) ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte    
	BUFFER2   DB 40 DUP(0) 
       PROTROPI DB 'DWSE MEXRI 10 MONOPSIFIOUS ARITHMOUS:  ',10,13,'$';
	PLITHOS  DB 10,13,10,13,'TO PLITHOS EINAI: $' ; To minima pou tha emfanistei
	MEGALITERA  DB 10,13,10,13,'TA GRAMMATA TA OPOIA I ASCI TIMI TOUS EINAI MEGALITERA APO TOU TELEUTEOU:',10,13,'$' 
	MIKROTERA  DB 10,13,10,13,'TA GRAMMATA TA OPOIA I ASCI TIMI TOUS EINAI MIKROTERA APO TOU TELEUTEOU:',10,13,'$'
	NOINPUT  DB 10,13,'Den eisagate kanena ARITHMO. Telos programmatos$';						
DEDOMENA ENDS


SOROS SEGMENT STACK
	DB 256 DUP(0)
SOROS ENDS
	
	END KYRIO