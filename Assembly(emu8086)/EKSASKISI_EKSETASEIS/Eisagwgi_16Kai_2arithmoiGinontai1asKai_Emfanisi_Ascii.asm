TITLE ASKISI5
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA, SS:SOROS

MAIN PROC NEAR
	MOV AX,DEDOMENA ; Apokatastash tou DS
	MOV DS,AX	; Apokatastash tou DS   
	 
	  
	
	CALL DISPLAY_HEX; Kaloume tin Display_hex 
	
	 MOV BH,DL   ; PRWTO PSIFIO STO BH
	 
     
    CALL DISPLAY_HEX      ;TO DEUTERO PSIFIO EINAI STO DL
    MOV BL,DL
    
    
    LEA DX,MINIMA2
    MOV AH,9
    INT 21H  
    
    MOV DL,BH
    CALL ONE_DIGIT2
    MOV DL,BL
    CALL ONE_DIGIT2 
     
     
   MOV DL,104
   MOV AH,2
   INT 21H 
    
    
    LEA DX,MINIMA3
    MOV AH,9
    INT 21H 
    
    
 
    
   MOV CX,BX 
   MOV AL,CH
   MOV AH,0
   
   
   MOV BL,16
   MUL BL 
   
   ADD CL,AL
   
   MOV DL,CL
   MOV AH,2
   INT 21H
     
   
	MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
	INT 21H
MAIN ENDP

DISPLAY_HEX PROC NEAR
	
	LEA DX,MINIMA
    MOV AH,9
    INT 21H

 V1:  MOV AH,08H
   INT 21H 
   
   CMP AL,48
   JB V1
   
   CMP AL,58
   JB SINEXEIA  
   
   CMP AL,65
   JB V1
   
   CMP AL,70
   JA V1
   
  
  
  
SINEXEIA:  

    MOV DL,AL
    MOV AH,2
    INT 21H
  
   
   CALL ONE_DIGIT
   


    RET
	
DISPLAY_HEX ENDP


ONE_DIGIT PROC NEAR
	
	CMP DL,57	; Sygkrinoume to DL me to 9 gia na ksexoriso an o DL exei arithmo 0-9 H metaksi 10-15
	JA GRAMMA	; An o DL einai metaksi 10-15 phgaine stin etiketa "Gramma" gia na emfanistei apo A-F

	SUB DL,48	; Metatrepoume ton arithmo poy exei o DL se xaraktira poy einai antistoixos se ASCII
	JMP TELOS	; Phgainoyme stin etiketa "Next" giati i epomeni grammi anaferetai gia arithmoys 10-15

GRAMMA:	SUB DL, 'A'-10	; Metatrepoume ton aritho pou einai 10-15 sto antistoixo gramma A-F prosthetontas 55


TELOS:	RET	
ONE_DIGIT ENDP

  
ONE_DIGIT2 PROC NEAR
	
	CMP DL,9	; Sygkrinoume to DL me to 9 gia na ksexoriso an o DL exei arithmo 0-9 H metaksi 10-15
	JA GRAMMA2	; An o DL einai metaksi 10-15 phgaine stin etiketa "Gramma" gia na emfanistei apo A-F

	ADD DL,48	; Metatrepoume ton arithmo poy exei o DL se xaraktira poy einai antistoixos se ASCII
	JMP TELOS2	; Phgainoyme stin etiketa "Next" giati i epomeni grammi anaferetai gia arithmoys 10-15

GRAMMA2:	ADD DL, 'A'-10	; Metatrepoume ton aritho pou einai 10-15 sto antistoixo gramma A-F prosthetontas 55


TELOS2:	
        MOV AH,2
        INT 21H
        RET	

ONE_DIGIT2 ENDP
  
  

KODIKAS ENDS

DEDOMENA SEGMENT
	MINIMA DB 10,13,"DWSE 0-9 ,A-F: ",10,13,"$" 
	MINIMA2 DB 10,13,"H ASCII TIMI TOU $"
	MINIMA3 DB " EINAI: $"
					
DEDOMENA ENDS

SOROS SEGMENT STACK
	DB 256 DUP(0)
SOROS ENDS
	END MAIN