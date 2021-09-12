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
        
        CMP AL,65
        JB BEEP
        
        CMP AL,90
        JA BEEP
        MOV NUM,AL
   
   JMP SINEXEIA       
	   
BEEP:
        MOV AH,2
        MOV DL,07
        INT 21H
        JMP V2
 
   
	   
SINEXEIA: 
        MOV DL,NUM
        MOV AH,2
        INT 21H

        LEA DX,MINIMA3
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H	

    MOV DL,NUM  
    CALL IPOPROGRAMMA
    
    MOV CX,AX   
    MOV DL,CH
    CALL DISPLAY_HEX
    
    MOV DL,CL
    CALL DISPLAY_HEX	

    MOV AH,4CH
    INT 21H    
     
 KYRIO ENDP  
    
 IPOPROGRAMMA PROC NEAR
	MOV AH,0
	MOV AL,DL
	MUL AL
	
	MOV BL,NUM
	MOV BH,0
	MUL BX
	
	MOV CX,6
H4: 
	
	SHR DX,1
	RCR AX,1
	
	LOOP H4
	

	RET		; Epistrefo stin thesi apo opou klithike h yporoutina

IPOPROGRAMMA ENDP    
 
 
 
 DISPLAY_HEX PROC NEAR
	
	MOV AL,DL
	
	MOV BL,16
	MOV AH,0
	DIV BL  
	
	MOV BX,AX 
	   
	  
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
    NUM DB 0
;	BUFFER   DB 40 DUP(0) ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte    
;	BUFFER2   DB 40 DUP(0) 
       PROTROPI DB 'DWSE 1 kefalaio gramma:  ',10,13,'$';
	MINIMA3  DB 10,13,10,13,'TO APOTELESMA EINAI: $' ; To minima pou tha emfanistei
;	MEGALITERA  DB 10,13,10,13,'TA GRAMMATA TA OPOIA I ASCI TIMI TOUS EINAI MEGALITERA APO TOU TELEUTEOU:',10,13,'$' 
;	MIKROTERA  DB 10,13,10,13,'TA GRAMMATA TA OPOIA I ASCI TIMI TOUS EINAI MIKROTERA APO TOU TELEUTEOU:',10,13,'$'
;	NOINPUT  DB 10,13,'Den eisagate kanena ARITHMO. Telos programmatos$';						
DEDOMENA ENDS


SOROS SEGMENT STACK
	DB 256 DUP(0)
SOROS ENDS
	    END KYRIO