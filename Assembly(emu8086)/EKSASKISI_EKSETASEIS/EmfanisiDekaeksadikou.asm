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
	CALL DISPLAY_HEX
	
	 
	  

	MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
	INT 21H
MAIN ENDP 
	
	
	DISPLAY_HEX PROC NEAR
	
	MOV AL,DL
	MOV AH,0
	
	MOV BL,16
	;MOV AH,0
	DIV BL  
	
	MOV BX,AX 
	 
	   LEA DX,MINIMA3
        MOV AH,9
        INT 21H
	   
	  
	MOV DL,BL
	CALL ONE_DIGIT
	
	MOV DL,BH
	CALL ONE_DIGIT
    
        RET			

DISPLAY_HEX ENDP   
	
	
	
	ONE_DIGIT PROC NEAR
	
	CMP DL,9	; Sygkrinoume to DL me to 9 gia na ksexoriso an o DL exei arithmo 0-9 H metaksi 10-15
	JA GRAMMA	; An o DL einai metaksi 10-15 phgaine stin etiketa "Gramma" gia na emfanistei apo A-F

	ADD DL,48	; Metatrepoume ton arithmo poy exei o DL se xaraktira poy einai antistoixos se ASCII
	JMP NEXT	; Phgainoyme stin etiketa "Next" giati i epomeni grammi anaferetai gia arithmoys 10-15

GRAMMA:	ADD DL, 'A'-10	; Metatrepoume ton aritho pou einai 10-15 sto antistoixo gramma A-F prosthetontas 55

NEXT:	MOV AH,02H	; Emfanizoyme stin othoni to periexomeno tou DL
	INT 21H 

TELOS:	RET		; Epistrefo stin thesi apo opou klithike h yporoutina

ONE_DIGIT ENDP

   
KODIKAS ENDS

DEDOMENA SEGMENT
	NUM1 DB 1Fh
	NUM2 DB 0B3h
	BUFFER   DB 40 DUP(0)
	  MINIMA DB "DWSE KEFALAIO GRAMMA TWRA VLAKA",10,13,"$"
	  MINIMA2 DB 10,13,"lathos",10,13,"$"
	    MINIMA3 DB 10,13,"TO APOTELESMA EINAI",10,13,"$"
	    NOINPUT DB 10,13,"APEUTHEIAS EKSODOS",10,13,"$"				
DEDOMENA ENDS

SOROS SEGMENT STACK
	DB 256 DUP(0)
SOROS ENDS
	END MAIN