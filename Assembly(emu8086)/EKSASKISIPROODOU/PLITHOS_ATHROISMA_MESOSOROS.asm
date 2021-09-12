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
	    
	     MOV AH,08H     
        INT 21h   
        
        
        CMP AL,'#'
        JE EMFANISI
        
        
        CMP AL,'0'
        JB V1
        
        CMP AL,'9'  
        JA V1
        
        MOV DL,AL
        ; ADD DL,48   
        MOV AH,2
        INT 21H 
        
        MOV BUFFER[SI],AL
        INC SI 
  
        CMP SI,5
        JE EMFANISI
        
        
        JMP V1
        
        
         
  
        
        
  EMFANISI:     
            
          
            MOV CX,SI
           JCXZ EXIT
           
                            
           MOV BX,SI 
           
           LEA DX,PLITHOS_ARITHMWN
	       MOV AH,09H	
	       INT 21H
                        
            
           MOV AX,BX
           MOV BL,10
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
           
           
           MOV BL,0 
           MOV BH,0
          
           MOV SI,0    
                 
                 
                      
    EPANALIPSI:  
    
           SUB BUFFER[SI],48          
                     
                     
           ADD BL,BUFFER[SI]
                    
                
           ADD SI,1
            LOOP EPANALIPSI 
            
            
           
            MOV CX,SI
                       
 
 ATHROISMA:
             LEA DX,ATHROISMA1
	       MOV AH,09H	; Typwnoume to mhnyma
	       INT 21H 
	       
	       
	       MOV AX,BX
	       MOV BL,10
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
     
     
     
    
    
            
  MESOS_OROS:         
             LEA DX,MESOS_OROS2
	       MOV AH,09H	; Typwnoume to mhnyma
	       INT 21H
                    
          MOV AL,BL          ;O PRWTOS ARITHMOS POU EVALA  EXEIS PROIGITHEI SUB BL,48
          MOV DH,BH          ;O DEUTEROS ARITHMOS POU EVALA  EXEIS PROIGITHEI SUB CL,48
	  
          MOV DL,10          ;DINW 10 STIN TIMI CL GIA NA POLLAPLASIASO TON PRWTO ARITHMO ME TO 10(AN EINAI 3 THA GINEI 3*10 OPOTE 30 KATW STO MUL)
          MUL DL
          ADD AL,DH          ;KAI TWRA POU TO AL EGINE 30 THA TOU DWSW KAI TO DH P.X. AN EINAI 3 THA GINEI 33
	  
	  
	  
         
  
    ;   SUB AL,48           ;EDW EXW TO TO ATHROISMA P.X. 11 ALLA AN PAW NA TO EMFANISW KAI THA VGEI ENA SIMVOLO H AN KANW +48 THA VGEI TO ERWTIMATIKO
       
       MOV BX,CX
       DIV BL 
      
         
        MOV BX,AX
       
       
       
       
       
      MOV DL,BL 
      ADD DL,48        ;edw emfanizw ton aski xaraktira to 33  
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
       PROTROPI DB 10,13,'Eisagete keimeno: ',10,13,'$';
	LATHOS  DB 10,13,'EDWSES ENTER APEUTHEIAS $'
	 PLITHOS_ARITHMWN DB 10,13,'TO PLITHOS TON ARITTHMWN EINAI: ',10,13,'$' 
	  ATHROISMA1 DB 10,13,'TO AHTORISMA TON ARITHMWN EINAI: ',10,13,'$'            
	MESOS_OROS2 DB 10,13,'O MESOS OROS EINAI : ',10,13,'$'
	
	TELIKO_MINIMA  DB 10,13,'Telos programmatos$';						
DEDOMENA ENDS

	END ARXH	