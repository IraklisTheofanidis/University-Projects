TITLE ASKISI3
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA,SS:SOROS
    KYRIO PROC NEAR
    
	    MOV AX,DEDOMENA ; Apokatastash tou DS
	    MOV DS,AX	; Apokatastash tou DS    
	    
	    MOV SI,0	             
	   
    
V1:	    LEA DX,PROTROPI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H	

V2:	   	
	    MOV AH,01H    	; Eisagoume xarakthra apo to plhktrologio me parallhlh emfanish
	    INT 21H		; H ASCII timh tou xarakthra apothikeuetai ston AL
        
        CMP AL,'@'
        JE IPO 
        
        MOV BUFFER[SI],AL
        INC SI
        CMP SI,5
        JNE V2 
        
     IPO: 
         LEA DX,PROTROPI3
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
	    
         MOV AH,01H    	; Eisagoume xarakthra apo to plhktrologio me parallhlh emfanish
	    INT 21H
      
      MOV BH,AL
      CALL YPO1
     
     
	  
	  
	 TELOS:  
	    MOV AH,4CH
	    INT 21H  
     
   KYRIO ENDP
   
   
   
  YPO1 PROC 
      MOV CX,SI  
      MOV DI,SI
      JCXZ TPT  
      
      MOV DH,0
      MOV SI,0
      EPANALIPSI:
         MOV BL,BUFFER[SI]   
         CMP BL,BH
         JNE SIN
         MOV CX,1
         MOV DH,1
       
        SIN:
         INC SI
      

      LOOP EPANALIPSI
      
      CMP DH,1
      JE YPARXEI
        LEA DX,DEN_IPARXEI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
       
        JMP EXIT
     
     YPARXEI:
       LEA DX,IPARXEI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H 
	    
	    MOV AH,01H
	    INT 21H
	    
	    MOV BL,AL
	    
	     
	      LEA DX,NEW
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
	     
	      
	     
	      MOV CX,DI
	      MOV DI,0
	    EPANALIPSI2:
	        MOV DL,BUFFER[DI]
	        CMP DL,BH
	        JNE TEL
	        MOV DL,BL
	       
	       TEL:
	       ; MOV DL,BL
	        MOV AH,2
	        INT 21H  
	        INC DI
	    
	    
	    LOOP EPANALIPSI2
	   
   
	    
	  JMP EXIT 
     
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
	IPARXEI  DB 10,13,10,13,'IPARXEI!KANE REPLACE ME: $' ; To minima pou tha emfanistei
	PROTROPI3  DB 10,13,10,13,'DWSE GIA ANAZITISI',10,13,'$' 
	DEN_IPARXEI  DB 10,13,10,13,'DEN IPARXEI ',10,13,'$' 
	NEW  DB 10,13,'THE NEW STRING IS: $';
	NOINPUT  DB 10,13,'Den eisagate kanena ARITHMO. Telos programmatos$';						
DEDOMENA ENDS


SOROS SEGMENT STACK
	DB 256 DUP(0)
SOROS ENDS
	
	END KYRIO