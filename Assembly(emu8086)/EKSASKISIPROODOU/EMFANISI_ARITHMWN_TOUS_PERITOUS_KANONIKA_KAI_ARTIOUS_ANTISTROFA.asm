     TITLE ASKISI3
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA
ARXH:
	    MOV AX,DEDOMENA ; Apokatastash tou DS
	    MOV DS,AX	; Apokatastash tou DS   
	 
	    MOV SI,0 
	    MOV DI,0 
	    MOV BL,0   
	    MOV BH,0    
  V1:
        LEA DX,PROTROPI
	    MOV AH,09H	
	    INT 21H
    	                  
    	MOV AH,08h      
        INT 21h      
        
         CMP AL,'#'
         JE EMFANISI
        
        CMP AL,'0'
        JB BEEP  
        
        CMP AL,'9'
        JA BEEP 
        
        MOV DL,AL
        MOV AH,2
        INT 21H 
        
        MOV BUFFER[SI],DL   
        MOV CL,DL
        
        SUB AL,48
                    
        MOV AH,0      
        MOV DL,2
        DIV DL
        CMP AH,1
        JE PERITOS 
        MOV ARTIOI[BX] ,CL
        ADD BX,1 
        JMP SINEXEIA
        
      ;  MOV DL,AH  
       ; ADD DL,48
        ;MOV AH,2
        ;INT 21H
      PERITOS:  
      MOV PERITOI[DI],CL
      ADD DI,1   
   
   
    SINEXEIA:           
        ADD SI,1       
                    
        CMP SI,5
        JNE V1            
                    
    	JMP EMFANISI                  
                     
    	              
           
  EXIT:      
  
        LEA DX,LATHOS
	    MOV AH,09H	
	    INT 21H
        JMP TELIKO 
        
   EMFANISI:
        
        LEA DX,ARITHMOI
	    MOV AH,09H	
	    INT 21H
        
         MOV CX,SI
         JCXZ EXIT  
          
          MOV SI,0
     ARITHMOI1:
          MOV DL,BUFFER[SI]
          ;MOV DL,CL  
          MOV AH,2
          INT 21H    
          
          ADD SI,1
         
         LOOP ARITHMOI1  
         
         MOV CX,DI
         JCXZ EARTIOS
         MOV DI,0 
         
         
           
         LEA DX,EPERITOI
	    MOV AH,09H	
	    INT 21H
     EPERITOS:
        MOV DL,PERITOI[DI] 
        MOV AH,2
        INT 21H
        
        ADD DI,1
      LOOP EPERITOS  
       
  
  LEA DX,EARTIOI
	    MOV AH,09H	
	    INT 21H
   EARTIOS: 
       MOV CX,BX 
       CMP CX,0
       JE TELIKO
       SUB BX,1
       
       
      EPAN_ARTIOSS:
       MOV DL,ARTIOI[BX]
       MOV AH,2
       INT 21H 
       SUB BX,1
       LOOP EPAN_ARTIOSS
      
         JMP TELIKO
         
        
    BEEP:
    	MOV AH,2
        MOV dl,07	    
        INT 21h
        JMP V1        
                        
        
 TELIKO:      
           MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
    	    INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
	BUFFER   DB 40 DUP(0) ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte
    PERITOI   DB 40 DUP(0)
    ARTIOI   DB 40 DUP(0)
       PROTROPI DB 10,13,'Eisagete keimeno: ',10,13,'$';
	LATHOS  DB 10,13,'EDWSES ENTER APEUTHEIAS ',10,13,'$'
	 EARTIOI DB 10,13,'OI ARTIOI ANTISTROFA EINAI: ',10,13,'$' 
	  ARITHMOI DB 10,13,'OI ARITHMOI EINAI: ',10,13,'$'            
	EPERITOI DB 10,13,'OI PERITOI EINAI : ',10,13,'$'	
	TELIKO_MINIMA  DB 10,13,'Telos programmatos$';						
DEDOMENA ENDS
	END ARXH	