                                                                     ASSUME CS:KODIKAS,DS:DATA
KODIKAS SEGMENT
			            ; OI 2 PARAKATO ENTOLES APOKATHISTOYN THN TIMH TOY DS.
ARXI:	MOV AX,DATA
     	MOV DS,AX
           
           
        MOV BH,0   
        MOV  BL,0    ; MHDENIZW TON BH POY TON EXW SAN METRHTH EPANALHPSEON     
        MOV CL,0   
        MOV SI,0
                 
        
V1:    
        LEA DX,MINIMA     ; BAZOYME TH DIEYTHINSI MNIMIS TOY MES STON DX
        MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H 	    ; KALOYME TO LEITOYRGIKO SYSTIMA NA EMFANISEI STIN OTHONI TO MES
   
        MOV AH,1      ; EISAGOYME XARAKTHRA APO TO PLIKTROLOGIO XORIS PARALLHLH EMFANISH
        INT 21h         ; H ASCII TIMH TOY XARAKTHRA APOTHIKEYETAI STON AL
                
               
                
        CMP AL,'9'   
        JA V2
        
        
        CMP AL,'0'  
        JAE ELEGXOS_ARITHMOS
       
	  
	   
 V2: 
 
    CMP AL,'A'
    JB V3
    
    CMP AL,'Z'
    JB ELEGXOS_GRAMMA
    
    
    CMP AL,'a' 
    JB V3
    
    
     CMP AL,'z'
     JB ELEGXOS_GRAMMA
    
    
    
    
V3:	
	                   
	                   
	   ADD BL,1               
	   JMP ELEGXOS    
         
        
        ELEGXOS_ARITHMOS:
        ADD Bh,1    
	    JMP ELEGXOS
         
        
        ELEGXOS_GRAMMA:
        ADD CL,1  
       
        
           
	    
	   ELEGXOS:  
	   
	   ADD SI,1
	   CMP SI,4  
	   JNE V1   
	     
	   
	    LEA DX,MINIMA_ARITHMOI     ; BAZOYME TH DIEYTHINSI MNIMIS TOY MES STON DX
        MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H 
	   
	   MOV DL,Bh
	  	 ADD DL,48    ; METAFERO STO DL TO XARAKTIRA POY EXOYME EISAGEI
	    MOV AH,2	    ; METAFEROYME STON AH TO 2 GIA NA MPOROYME NA EMFANISOYME TO PERIEXOMENO TOY DL
	    INT 21H    
	          
	          
	          
	      LEA DX,MINIMA_GRAMMATA    ; BAZOYME TH DIEYTHINSI MNIMIS TOY MES STON DX
        MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H            
	                
	     MOV DL,CL	    ; METAFERO STO DL TO XARAKTIRA POY EXOYME EISAGEI
	    ADD DL,48
	    MOV AH,2	    ; METAFEROYME STON AH TO 2 GIA NA MPOROYME NA EMFANISOYME TO PERIEXOMENO TOY DL
	    INT 21H   
	    
	    
	    LEA DX,MINIMA_IPOLOIPA    ; BAZOYME TH DIEYTHINSI MNIMIS TOY MES STON DX
        MOV AH,9 	    ; METAFEROYME STON AH TO 9 GIA NA MPOROYME NA EMFANISOYME TO MES
        INT 21H 
	    
	   
	   
	   
	   
	     MOV DL,BL
	      ADD DL,48	    ; METAFERO STO DL TO XARAKTIRA POY EXOYME EISAGEI
	    MOV AH,2	    ; METAFEROYME STON AH TO 2 GIA NA MPOROYME NA EMFANISOYME TO PERIEXOMENO TOY DL
	    INT 21H  
	    
	     
	    
	  
             
	         
        MOV AH,4CH
        INT 21H
KODIKAS ENDS

DATA SEGMENT   
    MINIMA DB 10,13,"DWSE MIA TIMI",10,13,"$"  ;MINIMA PROTROPIS PROS TON XRHSTH
    MINIMA_ARITHMOI DB 10,13,"Oi Arithmoi einai: ",10,13,"$"    ;MINIMA GIA THN PERIPTOSI EISAGOGIS 0
    MINIMA_GRAMMATA DB 10,13,"Ta grammata einai: ",10,13,"$"    ;MINIMA GIA THN PERIPTOSI EISAGOGIS ARTIOY
    MINIMA_IPOLOIPA DB 10,13,"TA IPOLOIPA EINAI: ",10,13,"$"
      
   
DATA ENDS 

END ARXI		        ; ME TIN ODIGIA END LEME