                                             TITLE ASK2
ASSUME CS:KODIKAS,DS:DATA
KODIKAS SEGMENT
			            ; OI 2 PARAKATO ENTOLES APOKATHISTOYN THN TIMH TOY DS.
ARXI:	MOV AX,DATA
     	MOV DS,AX
        
        MOV  BH,0    ; MHDENIZW TON BH POY TON EXW SAN METRHTH EPANALHPSEON
v1:    
        LEA DX,MES      ; BAZOYME TH DIEYTHINSI MNIMIS TOY MES STON DX
        MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H 	    ; KALOYME TO LEITOYRGIKO SYSTIMA NA EMFANISEI STIN OTHONI TO MES
   
        MOV AH,1      ; EISAGOYME XARAKTHRA APO TO PLIKTROLOGIO XORIS PARALLHLH EMFANISH
        INT 21h         ; H ASCII TIMH TOY XARAKTHRA APOTHIKEYETAI STON AL
                
                
       CMP AL,64
       JE TELOS         
                
                
        CMP AL,'0'
        JB V2
        
        CMP AL,'9'  
        JA V2 
        
     ;   MOV DL,AL
	   ; MOV AH,2
	   ; INT 21H  
	    
	    
	    CMP AL,'0'
	    JE MIDEN
        
        MOV AH,0 
        MOV DL,2
        DIV DL
        CMP AH,0
        JE ARTIOS 
        
        
        LEA DX,MES_PER   
        MOV AH,9 	    
        INT 21H  
        
	   
	    
	    JMP V1 
         
        
          
   V2:    
   
     
       ; MOV DL,AL
	   ; MOV AH,2
	   ; INT 21H
        
	    CMP AL,47
	    JBE SIMVOLA
	    
	    
	    CMP AL,64
	    JB SIMVOLA
	                             
	    CMP AL,123
	    JAE SIMVOLA
	                                                 
	                         
	    CMP AL,'a'
	    JAE lathosmikra   
	    
	                     
	                     
	                    
	                     
	    CMP AL,91
	    JAE SIMVOLA
	                           
	    LEA DX,MES_lathosKEFALAIO  
        MOV AH,9 	    
        INT 21H   
        
	    
	    JMP BEEP
	     
	     
	     
	     
	    lathosmikra:  
	    LEA DX,MES_lathosMIKRO 
        MOV AH,9 	    
        INT 21H
                
        JMP BEEP 
        
        
        SIMVOLA:
        LEA DX,MES_lathosSIMVOLO 
        MOV AH,9 	    
        INT 21H
        
               
               
        BEEP:
        
       
         
         MOV AH,2
	    MOV dl,07	    
	    INT 21h  
	    
	    
	     MOV AH,2
	    MOV dl,07	    
	    INT 21h 
	    
	    
	    JMP V1      
        
    	;  MOV DL,AL
    	 ; ADD DL,48
	   
	ARTIOS:  
	
	           
	    LEA DX,MES_ART      
        MOV AH,9 	    
        INT 21H 
         JMP V1
        
	     
	    
	MIDEN:   
	    LEA DX,MES_ZERO     
        MOV AH,9 	    
        INT 21H  
                   
            JMP V1           
	    
	    
     TELOS:
	         
	         
	     LEA DX,MES_PAPAKI   
        MOV AH,9 	    
        INT 21H      
	         
        MOV AH,4CH
        INT 21H
KODIKAS ENDS

DATA SEGMENT   
    MES DB "Eisagete ena monopsifio arithmo 0-9",10,13,"$"  ;MINIMA PROTROPIS PROS TON XRHSTH
    MES_ZERO DB 10,13,"O Arithmos einai miden",10,13,"$"    ;MINIMA GIA THN PERIPTOSI EISAGOGIS 0
    MES_ART DB 10,13,"O Arithmos einai artios",10,13,"$"    ;MINIMA GIA THN PERIPTOSI EISAGOGIS ARTIOY
    MES_PER DB 10,13,"O Arithmos einai peritos",10,13,"$"
    MES_lathosKEFALAIO DB 10,13,"EDWSES KEFALAIO GRAMA , DWSE ARITHMO",10,13,"$" 
    MES_lathosMIKRO DB 10,13,"EDWSES MIKRO GRAMMA,DWSE ARITHMO",10,13,"$"   ;MINIMA GIA THN PERIPTOSI EISAGOGIS PERITOY    
    MES_lathosSIMVOLO DB 10,13,"EDWSES SIMVOLO,DWSE ARITHMO",10,13,"$"   ;MINIMA GIA THN PERIPTOSI EISAGOGIS PERITOY   
    MES_PAPAKI DB 10,13,"EDWSES PAPAKI ARA TELEIWSE TO PROGRAMMA",10,13,"$"
DATA ENDS 

END ARXI		        ; ME TIN ODIGIA END LEME