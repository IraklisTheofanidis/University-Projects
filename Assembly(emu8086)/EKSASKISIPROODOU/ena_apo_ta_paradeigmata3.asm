 TITLE ASKISI3
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA
ARXH:
	    MOV AX,DEDOMENA ; Apokatastash tou DS
	    MOV DS,AX	; Apokatastash tou DS   
	 
	    MOV SI,0 
	    MOV BX,0
	    MOV DI,0
	    
	    LEA DX,PROTROPI
	    MOV AH,09H	
	    INT 21H    
  V1:
       
    	                  
    	MOV AH,08h      
        INT 21h      
        
         CMP AL,'#'
         JE EMFANISI
        
        CMP AL,'0'
        JB BEEP  
               
        CMP AL,58
        JB V2    
        
        CMP AL,65
        JB BEEP
        
        CMP AL,91
        JB V2
        
        CMP AL,97
        JB BEEP
        
        
        
        
         
  V2:       
        
        MOV DL,AL
       MOV AH,2
       INT 21H  
       
        MOV BUFFER[SI],DL 
          
        CMP AL,58  
        JAE GRAM
        MOV ARITHMOI[DI],DL    
        ADD DI,1
        
        JMP SINEXEIA
        
      GRAM:  
      MOV GRAMMATA[BX],DL
      ADD BX,1
      
      SINEXEIA: 
        
        ADD SI,1
        CMP SI,5
        JNE V1    
       
       
         
    EMFANISI:  
    LEA DX,OLA
	    MOV AH,09H	
	    INT 21H 
    
        MOV CX,SI
        JCXZ EXIT 
        MOV SI,0 
        LOOP_PINAKA:
          MOV DL,BUFFER[SI] 
            MOV AH,2
           INT 21H 
           ADD SI,1
        LOOP LOOP_PINAKA
                 
                 
         LEA DX,ARITHMOII
	    MOV AH,09H	
	    INT 21H
      
         MOV CX,DI
         JCXZ GR
         MOV DI,0
        
         
        LOOP_ARITHMWN:
            MOV DL,ARITHMOI[DI]
            ADD DI,1
            MOV AH,2
            INT 21H
        
        LOOP LOOP_ARITHMWN 
        
   GR:      
            MOV CX,BX 
            CMP CL,0
            JE EXIT2
            
            MOV BX,0
          LEA DX,GRAMMATAA
	    MOV AH,09H	
	    INT 21H
         LOOP_GRAMMATA:
            MOV DL,GRAMMATA[BX]
            ADD BX,1
            MOV AH,2
            INT 21H
        
        LOOP LOOP_GRAMMATA        
            
        
        JMP TELIKO
        
    BEEP:
    	MOV AH,2
        MOV dl,07	    
        INT 21h
        JMP V1
        
  
  EXIT2:
          LEA DX,GRAMMATAA
	    MOV AH,09H	
	    INT 21H
         JMP TELIKO
        
  EXIT:
       LEA DX,LATHOS
	    MOV AH,09H	
	    INT 21H            
                        
        
 TELIKO:      
           MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
    	    INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
	BUFFER   DB 40 DUP(0) ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte
    GRAMMATA   DB 40 DUP(0)
    ARITHMOI   DB 40 DUP(0)
       PROTROPI DB 10,13,'Eisagete keimeno: ',10,13,'$'
       OLA DB 10,13,'OLA: ',10,13,'$';
	LATHOS  DB 10,13,'EDWSES ENTER APEUTHEIAS ',10,13,'$'
	 GRAMMATAA DB 10,13,'TA GRAMMATA EINAI: ',10,13,'$' 
	  ARITHMOII DB 10,13,'OI ARITHMOI EINAI: ',10,13,'$'            					
DEDOMENA ENDS
	END ARXH	