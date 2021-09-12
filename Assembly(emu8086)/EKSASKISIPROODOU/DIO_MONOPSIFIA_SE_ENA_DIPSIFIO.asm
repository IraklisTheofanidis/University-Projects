                                                TITLE ASK2
ASSUME CS:KODIKAS,DS:DATA
KODIKAS SEGMENT
			            ; OI 2 PARAKATO ENTOLES APOKATHISTOYN THN TIMH TOY DS.
ARXI:	MOV AX,DATA
     	MOV DS,AX
        
        MOV  DI,0    ; MHDENIZW TON BH POY TON EXW SAN METRHTH EPANALHPSEON
v1:    
        LEA DX,MES      ; BAZOYME TH DIEYTHINSI MNIMIS TOY MES STON DX
        MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H 	    ; KALOYME TO LEITOYRGIKO SYSTIMA NA EMFANISEI STIN OTHONI TO MES
   
        MOV AH,08h      ; EISAGOYME XARAKTHRA APO TO PLIKTROLOGIO XORIS PARALLHLH EMFANISH
        INT 21h         ; H ASCII TIMH TOY XARAKTHRA APOTHIKEYETAI STON AL
           
        CMP AL,'0'
        JB BEEP
        
        CMP AL ,'9'
        JA BEEP   
        
        MOV DL,AL
       ; ADD DL,48
        MOV AH,2
        INT 21H   
 
        
        ADD DI,1
        
        CMP DI,1
        JE  ALMA
        MOV CL,AL   
        SUB CL,48 
        
        JMP ALMA2
        
        
   ALMA:    
        MOV BL,AL   
        SUB BL,48
         
    
    
   ALMA2:     
        CMP DI,2
        JE EXIT 
        
  
        JMP V1
        
               
   BEEP:
        
       
         
         MOV AH,2
	    MOV dl,07	    
	    INT 21h  
	    
	    
	     MOV AH,2
	    MOV dl,07	    
	    INT 21h 
	    
	     JMP V1
	   
	EXIT:
	    

	  MOV AL,BL          ;O PRWTOS ARITHMOS POU EVALA  EXEIS PROIGITHEI SUB BL,48
	  MOV DH,CL          ;O DEUTEROS ARITHMOS POU EVALA  EXEIS PROIGITHEI SUB CL,48
	  
	  MOV CL,10          ;DINW 10 STIN TIMI CL GIA NA POLLAPLASIASO TON PRWTO ARITHMO ME TO 10(AN EINAI 3 THA GINEI 3*10 OPOTE 30 KATW STO MUL)
	        
	        
	  MUL CL
	  
	  ADD AL,DH          ;KAI TWRA POU TO AL EGINE 30 THA TOU DWSW KAI TO DH P.X. AN EINAI 3 THA GINEI 33
	  
	  
	  
	  MOV BX,AX
	   
	    
	     MOV DL,BL
         MOV AH,2
         INT 21H   
        
         
        CMP BX,31
        JBE MINIMA_LATHOSS 
        
         CMP BX,47
         JBE SIMVOLO
         
         
         CMP BX,57
         JBE ARITHMOS
         
         CMP BX,64
         JBE SIMVOLO
         
         CMP BX,90
         JBE KEFALAIO
         
         CMP BX,96
         JBE SIMVOLO
         
         CMP BX,122
         JBE MIKRO
         
         JMP SIMVOLO
         
        
        
        JMP TELOS
	    
	 ;   MOV DL,CL
   ;     ;ADD DL,48
    ;    MOV AH,2
     ;   INT 21H            
	                
	                
	MINIMA_LATHOSS:
	    LEA DX,MINIMA_LATHOS  
	    MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H     
        JMP TELOS
        
        
     SIMVOLO:
           LEA DX,MINIMA_SIMVOLO2  
	    MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H     
        JMP TELOS
     
     
     ARITHMOS:
            LEA DX,MINIMA_ARITHMOS2  
	    MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H     
        JMP TELOS
     
     MIKRO:
             LEA DX,MINIMA_MIKRO2  
	    MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H     
        JMP TELOS
     
     KEFALAIO:   
              LEA DX,MINIMA_KEFALAIO2  
	    MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H     
        JMP TELOS
        
	                    
	TELOS:               
	               
        MOV AH,4CH
        INT 21H
KODIKAS ENDS

DATA SEGMENT   
    MES DB 10,13,"Eisagete ena monopsifio arithmo 0-9",10,13,"$"
    MINIMA_LATHOS DB 10,13,"DEN EINAI EKTIPOSIMOS XARAKTIRAS",10,13,"$"  ;MINIMA PROTROPIS PROS TON XRHSTH
    MINIMA_KEFALAIO2 DB 10,13,"EINAI KEFALAIO",10,13,"$"  
    MINIMA_MIKRO2 DB 10,13,"EINAI MIKRO",10,13,"$" 
    MINIMA_ARITHMOS2 DB 10,13,"EINAI ARITHMOS",10,13,"$" 
    MINIMA_SIMVOLO2 DB 10,13,"EINAI SIMVOLO",10,13,"$" 
      ;MINIMA GIA THN PERIPTOSI EISAGOGIS PERITOY
DATA ENDS 

END ARXI		        ; ME TIN ODIGIA END LEME