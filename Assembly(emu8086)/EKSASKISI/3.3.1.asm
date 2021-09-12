TITLE ASKISI3
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA
ARXH:
	    MOV AX,DEDOMENA ; Apokatastash tou DS
	    MOV DS,AX	; Apokatastash tou DS   
	    
	    MOV SI,0     
	    MOV DI,0
	    
    
  	    LEA DX,PROTROPI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
	    
	     MOV AH,1     
        INT 21h   
        
        
        
	               
	    CMP AL,13 ;ELEGXOS GIA ENTER
	    JE EMFANISI_LATHOS     
	    
	    
V1:	     

        CMP DI,5
         JE EXIT    
	     
	    CMP AL,32 ;ELEGXOS GIA SPACE
	    JE EMFANISI 
	    
	    CMP AL,'!'
	    JE EMFANISI
	    
	    CMP AL,'.'
	    JE EMFANISI 
	    
	    CMP AL,'A'
	    JB  EMFANISI2
	    
	    CMP AL,'Z'
	    JB  EMFANISI
	    
	    CMP AL,'a'
	    JB EMFANISI2
	    
	    CMP AL,'z'
	    JB EMFANISI
	    
	     
	               
	               
	    JMP EXIT
	     
	     
	    
	    
 EMFANISI:
	    
	     MOV BUFFER[SI],AL
	     INC SI  
	     INC DI 
	     
	     
	     
	     
	     
	    MOV AH,1     
        INT 21h
        
         CMP AL,13
         JNE V1
         
	    
	    JMP  EXIT 
	    



EMFANISI2: 

        
        INC DI
        
          MOV AH,1     
        INT 21h  
        
          
        
         CMP AL,13
         JNE V1 
         
         
            
        JMP EXIT	    
	    
	     
	;      MOV DL,CL
  ;      ADD DL,48
   ;     MOV AH,2
    ;    INT 21H
	    
	    
 EMFANISI_LATHOS:
            LEA DX,LATHOS
            MOV AH,09H	; Typwnoume to mhnyma
	        INT 21H
	        JMP TELIKO
	    
	     
	    
 EXIT:	
 
    MOV CX,SI
    JCXZ TELIKO
    MOV SI,0  
    
    
    LEA DX,TELIKO_MINIMA
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
 
    
 E2:   
    
        MOV DL,BUFFER[SI]
        
        CMP DL,32 
        JE E4     
        
        CMP DL,'.'
        JE E4
        
        CMP DL,'!'
        JE E4
        
        CMP DL,'Z'
        JA E3
        
        ADD DL,32
        JMP E4
        
 E3:    
 
        SUB DL,32
        
 E4:    
 
        MOV AH,02H
        INT 21H
        INC SI
        
 E5:    LOOP E2
      
        
   
        
        
        
        
        
        
 
 TELIKO:      
           MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
    	    INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
	BUFFER   DB 40 DUP(0) ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte
       PROTROPI DB 'Eisagete keimeno:  $';
	LATHOS  DB 10,13,10,13,'EDWSES ENTER APEUTHEIAS $' ; To minima pou tha emfanistei
	TELIKO_MINIMA  DB 10,13,'Telos programmatos$';						
DEDOMENA ENDS

	END ARXH	