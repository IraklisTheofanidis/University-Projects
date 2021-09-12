TITLE ASKISI5
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA, SS:SOROS

MAIN PROC NEAR
	MOV AX,DEDOMENA ; Apokatastash tou DS
	MOV DS,AX	; Apokatastash tou DS
 
 
  LEA DX,MINIMA
        MOV AH,9
        INT 21H  
   MOV SI,0     
        
V1:     
     MOV AH,08H
	INT 21H
	   
	CMP AL,48
	JE V2   
	   
	CMP AL,49
	JNE V1  
         ;                              
 V2:  
      
    MOV DL,AL
    MOV AH,2
    INT 21H 
    SUB AL,48
    MOV BUFFER[SI],AL
    
    INC SI
    
    CMP SI,8
    JNE V1

  MOV CX,SI
 
  MOV SI,0   ;GIA BUFFER
  MOV BL,0   ;PROSTHESI

  EPANALIPSI:
 
  MOV AL,BUFFER[SI]
  CMP AL,1
  JNE SINEXEIA
  
  SUB CL,1
  SHL AL,CL 
  ADD CL,1
  
  ADD BL,AL  
  
  SINEXEIA:
  INC SI 
  INC DH
  
  LOOP EPANALIPSI
  
  MOV CL,BL 
  
  CMP CL,100
  JA TRIPSIFIOS
 
  CMP CL,10
  JA DIPSIFIOS 
  LEA DX,ENA
        MOV AH,9
        INT 21H
  
  
   MOV DL,CL
   ADD DL,48
   MOV AH,2
   INT 21H
  JMP TELOS2 
   
  DIPSIFIOS:     
  
  LEA DX,DIO
        MOV AH,9
        INT 21H
  
   MOV AL,CL
   MOV BL,10
   MOV AH,0
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
   JMP TELOS2  
   
  TRIPSIFIOS:   
  LEA DX,TRIA
        MOV AH,9
        INT 21H 
        
        
    MOV AH,0
        MOV AL,CL    
        MOV CL,100
        DIV CL
        
        MOV BX,AX
        
        MOV DL,AL
        ADD DL,48
        MOV AH,2
        INT 21H
        
        MOV AX,0
        MOV AL,BH
        
        MOV CL,10
        DIV CL
         
        MOV BH,AH
        MOV DL,AL
        ADD DL,48
        MOV AH,2
        INT 21H
        
        MOV DL,BH
        ADD DL,48
        MOV AH,2
        INT 21H
	 
	  
 TELOS2:
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
	   
	  
	MOV DL,BL
	CALL ONE_DIGIT
	
	MOV DL,BH
	CALL ONE_DIGIT    
	
	MOV DL,104
	MOV AH,2
	INT 21H
    
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
	BUFFER   DB 40 DUP(0) 
	  MINIMA DB "EISAGETE 4 DIADIKA PSIFIA(0 H 1)",10,13,"$"
	  ENA DB 10,13,"O MONOPSIFIOS ARITHMOS EINAI:",10,13,"$" 
	  DIO DB 10,13,"O DIPSIFIOS ARITHMOS EINAI:",10,13,"$"
	  TRIA DB 10,13,"O TRIPSIFIOS ARITHMOS EINAI:",10,13,"$"
	    DEKA DB 10,13,"TO APOTELESMA STO DEKADIKO EINAI",10,13,"$"				
DEDOMENA ENDS

SOROS SEGMENT STACK
	DB 256 DUP(0)
SOROS ENDS
	END MAIN