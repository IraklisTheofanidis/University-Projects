TITLE ASKISI5
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA, SS:SOROS

MAIN PROC NEAR
	MOV AX,DEDOMENA ; Apokatastash tou DS
	MOV DS,AX	; Apokatastash tou DS
 
 
V1:  LEA DX,MINIMA
        MOV AH,9
        INT 21H
        
 
V2:	MOV AH,08H
	INT 21H
	
	MOV DL,AL
    MOV AH,2
    INT 21H  
          
    JMP V4  

V4:	     	
	MOV DL, AL	; Metaferoume to athroisma apo ton AL ston DL gia na ginei to perasma meso kataxoriti
	CALL OKTADIKO; Kaloume tin Display_hex  
		
	MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
	INT 21H
MAIN ENDP

OKTADIKO PROC NEAR
	
	MOV AL,DL 
	 
	
	MOV BL,8
	MOV AH,0
	DIV BL  
	
	MOV BX,AX 
	 
	   LEA DX,MINIMA3
       MOV AH,9
       INT 21H
	
	 
	CMP BL,7H
	JA PROSTHESE
	JMP SINEXEIA
	
	PROSTHESE:
	ADD BL,8H
	
	SINEXEIA: 
	MOV AH,0 
	
	CMP AL,10
	
	MOV AL,BL
	MOV BL,16
	DIV BL
	
	
	MOV CX,AX
	
	MOV DL,CL
	ADD DL,48
	MOV AH,2
	INT 21H
	
	MOV DL,CH
	ADD DL,48
	MOV AH,2
	INT 21H

	MOV DL,BH
	ADD DL,48
	MOV AH,2
	INT 21H
    
        RET			

OKTADIKO ENDP

  
   
KODIKAS ENDS

DEDOMENA SEGMENT
	  MINIMA DB "DWSE KEFALAIO GRAMMA TWRA VLAKA",10,13,"$"
	  MINIMA2 DB 10,13,"VLAKA",10,13,"$"
	    MINIMA3 DB 10,13,"METATROPI SE OKTADIKO",10,13,"$"				
DEDOMENA ENDS

SOROS SEGMENT STACK
	DB 256 DUP(0)
SOROS ENDS
	END MAIN