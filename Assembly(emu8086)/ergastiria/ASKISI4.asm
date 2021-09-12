TITLE ASKISI
    KODIKAS SEGMENT PUBLIC
    ASSUME CS:KODIKAS, DS:DEDOMENA, SS:SOROS
    MAIN PROC NEAR
        MOV AX,DEDOMENA  ; Apokatastash tou DS
        MOV DS,AX ; Apokatastash tou DS
        
        
      MOV CX,80  
      lea BX,BUFFER
      
      
       LEA DX,MINIMA      ; BAZOYME TH DIEYTHINSI MNIMIS TOY MES STON DX
        MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H  
          MOV DL,0
      B2:
        
        MOV AH,01H    	; Eisagoume xarakthra apo to plhktrologio me parallhlh emfanish
	    INT 21H	
	    MOV BUFFER[BX],AL 
	     INC BX
	     
	      
        CMP AL,35
        LOOPNE B2
        
       CALL DISPLAY-HEX; Kaloume tin Display_hex     
       
       MOV AH,4CH; Eksodos sto leitoyrgiko systhma
          INT 21H
     MAIN ENDP       
    
    
     DISPLAY-HEX PROC NEAR

     LEA DX,MINIMA2      ; BAZOYME TH DIEYTHINSI MNIMIS TOY MES STON DX
        MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H     
        
         
          
        MOV AH,01H    	; Eisagoume xarakthra apo to plhktrologio me parallhlh emfanish
	    INT 21H
	    
	    CMP BUFFER[BX],AL  
	    JNE TELOS 
	       
        
        INC DL  
        
         MOV BL,DL
        ADD BL,48
        MOV AH,2
        INT 21H
        
        
        TELOS: 
        
         
        
        
     RET; Epistrefo stin thesi apo opou klithike h yporoutina
    DISPLAY-HEX ENDP

    KODIKAS ENDS
    DEDOMENA SEGMENT 
      MINIMA DB "DWSE ENA STRING: ",10,13,"$" 
      MINIMA2 DB "MINIMA IPOPROGRAMMATOS: ",10,13,"$"  
      BUFFER db 126 dup (0)     

    DEDOMENA ENDS
    
    SOROS SEGMENT STACK
        DB 256 DUP(0)
    SOROS ENDS
END MAIN