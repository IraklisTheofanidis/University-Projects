TITLE ASKISI3
KODIKAS SEGMENT PUBLIC
ASSUME CS:KODIKAS, DS:DEDOMENA
ARXH:
	    MOV AX,DEDOMENA ; Apokatastash tou DS
	    MOV DS,AX	; Apokatastash tou DS    
	    
	    MOV BH,0
	    MOV CH,0
	    MOV DI,0	             
	   
    
V1:	    LEA DX,PROTROPI
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H	

V2:	   	
        
        
	    MOV AH,08H    	; Eisagoume xarakthra apo to plhktrologio me parallhlh emfanish
	    INT 21H		; H ASCII timh tou xarakthra apothikeuetai ston AL
        
        CMP AL,65
        JB V2
        
        CMP AL,91
        JB KEFALAIO
        
        
        
        CMP AL,97
        JB V2
        
        CMP AL,123
        JAE V2
        
        CMP CH,49
        JE V2
         
        MOV CH,49 ;49 DLD
        INC DI
          
         
         MOV CL,AL 
        MOV DL,AL
        MOV AH,2
        INT 21H    
        
        CMP DI,2
        JE SINEXEIA
        
        CMP CH,49  
        JE V2
        
        
        
        KEFALAIO:
        CMP BH,49
        JE V2
         
        MOV BH,49 ;49 DLD 
        INC DI
       
        MOV BL,AL 
        MOV DL,AL
        MOV AH,2
        INT 21H 
        
        CMP DI,2
        JE SINEXEIA
        
        
        
        
        CMP BH,49  
        JE V2
        
    SINEXEIA:
    
    SUB CL,BL
    CMP CL,24
    JBE TPT  
    
     
    MOV BH,0
    MOV CH,0
    MOV DI,0 
    INC SI
    CMP SI,5
    JNE V2
    
        
	   

 TPT:
     LEA DX,AKIRO
	    MOV AH,09H	; Typwnoume to mhnyma
	    INT 21H
	   
	   MOV AH,0
	   MOV AL,CL
	   
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
	   
	    
	             
	   
EXIT:	    
           MOV AH,4CH	; Eksodos sto leitoyrgiko systhma
    	    INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
	BUFFER   DB 'C','O','D','E','$' ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte    
	BUFFER2   DB 40 DUP(0) 
       PROTROPI DB 'DWSE TON KODIKO:  ',10,13,'$';
	MESSAGE  DB 10,13,10,13,'EGKIROS KODIKOS:',10,13,'$' ; To minima pou tha emfanistei
	MESSAGE2  DB 10,13,10,13,'OLOI OI ZIGOI ANAPODA:',10,13,'$'
	AKIRO  DB 10,13,'H DIAFORA TOUS $';						
DEDOMENA ENDS

	END ARXH