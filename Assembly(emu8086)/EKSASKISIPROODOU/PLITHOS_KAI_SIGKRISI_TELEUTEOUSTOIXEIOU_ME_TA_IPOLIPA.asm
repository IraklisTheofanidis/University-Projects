                                               TITLE ASKISI3
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA
ARXH:
	    MOV AX,DEDOMENA ; Apokatastash tou DS
	    MOV DS,AX	; Apokatastash tou DS   
	    
	    MOV SI,0 
	    
	    
	    
	      
	   
V1:    
        
        LEA DX,PROTROPI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
	    
	     MOV AH,1     
        INT 21h   
        
        
        CMP AL,'#'
        JE EMFANISI
        
        
        CMP AL,'0'
        JB V1
        
        CMP AL,'9'  
        JA V1
        
          
        
        MOV BUFFER[SI],AL
        INC SI 
  
        CMP SI,5
        JE EMFANISI
        
        
        JMP V1
        
        
         
  
        
        
  EMFANISI:     
            
          
            MOV CX,SI
           JCXZ EXIT
           
                            
           MOV BX,SI 
           SUB SI,1 
          
           MOV CX,SI 
           
           LEA DX,PLITHOS_ARITHMWN
	       MOV AH,09H	
	       INT 21H
                        
                        
                        
           MOV DL,BL
           ADD DL,48
           MOV AH,2
           INT 21H   
           
           MOV DL,BUFFER[SI]   
                        
          
           
           
           MOV DI,0
           MOV BH,0
           MOV SI,0    
                 
                 
                      
    EPANALIPSI:  
    
               
           MOV BL,BUFFER[SI]
           CMP DL,BL 
           JA MIKROTERWN  
           ADD DI,1
            
           JMP L
           
           
  MIKROTERWN:
            
            ADD BH,1
                     
   L:             
           ADD SI,1
            LOOP EPANALIPSI
                       
 
 PLITHOS_MEG:
             LEA DX,PLITHOS_MIKROTERWN
	       MOV AH,09H	; Typwnoume to mhnyma
	       INT 21H
          
           MOV DL,BH
            ADD DL,48
            MOV AH,2
            INT 21H                    
            
  PLITHOS_MIKRO:         
             LEA DX,PLITHOS_MEGALITERWN
	       MOV AH,09H	; Typwnoume to mhnyma
	       INT 21H
                    
           MOV DX,DI         
                    
          ; MOV DL,DH
            ADD DL,48
            MOV AH,2
            INT 21H 
            
            JMP TELIKO 
           
  EXIT:      
  
        LEA DX,LATHOS
	    MOV AH,09H	
	    INT 21H
        JMP TELIKO         
                        
        
 TELIKO:      
           MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
    	    INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
	BUFFER   DB 40 DUP(0) ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte
       PROTROPI DB 10,13,'dwse arithmo: ',10,13,'$';
	LATHOS  DB 10,13,'EDWSES ENTER APEUTHEIAS $'
	 PLITHOS_ARITHMWN DB 10,13,'TO PLITHOS TON ARITTHMWN EINAI: ',10,13,'$' 
	  PLITHOS_MIKROTERWN DB 10,13,'TO PLITHOS TON MIKROTERWN EINAI: ',10,13,'$'            
	PLITHOS_MEGALITERWN DB 10,13,'TO PLITHOS TON MEGALITERWN EINAI: ',10,13,'$'
	
	TELIKO_MINIMA  DB 10,13,'Telos programmatos$';						
DEDOMENA ENDS

	END ARXH	