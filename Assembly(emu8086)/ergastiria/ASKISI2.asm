TITLE SIMPLE_ADD
KODIKAS SEGMENT
    ASSUME CS:KODIKAS, DS:DEDOMENA
    ARXI:   
        MOV AX,DEDOMENA	
	    MOV DS,AX	
        
        MOV BH,0
         
    V1:
        
        LEA DX,MINIMA
        MOV AH,9
        INT 21H
       
        mov AH,08h
        int 21h
       
           
        CMP AL,'0'
        JB V1
        
        CMP AL,'9'
        JA V1 
         
        
          MOV DL,AL
         ; ADD DL,48  EINAI IDI SE ASKI APO OTI KATALAVA OTAN TO VAZEIS APO TO PLIKTROLOGIO OPOTE DEN XREIAZETE NA TO PROSTHESW ME TO 48
           MOV AH,2 
          INT 21H   
          
         CMP AL,'0'
         JE MIDEN  
         
        MOV AH,0
        
             MOV BL,2   
             DIV BL
        
            CMP AH,0
            JE ARTIOS
        
         LEA DX,MES_PER
         MOV AH,9
         INT 21H
         JMP ELEGXOS 
         
         ARTIOS:
             LEA DX,MES_ART
             MOV AH,9
             INT 21H
             JMP ELEGXOS
         
         
         
         
         MIDEN:
          
        LEA DX,MES_ZERO
        MOV AH,9
        INT 21H
       
         
          
               
          
       
        
        ELEGXOS:              
        
        INC BH		    ; AFKSANW TO METRHTH KATA ENA
	    CMP BH,5	    ; SYGKRINW TO METRHTH ME TO 5
	    JB V1
    
        MOV AH,4CH
        INT 21H
	
KODIKAS ENDS

DEDOMENA SEGMENT  
   
    MINIMA DB "DWSE ENAN MONOPSIFIO ARITHMO 0-9:",10,13,"$"      
    MES_ZERO DB 10,13,"O Arithmos einai miden",10,13,"$"    ;MINIMA GIA THN PERIPTOSI EISAGOGIS 0
    MES_ART DB 10,13,"O Arithmos einai artios",10,13,"$"    ;MINIMA GIA THN PERIPTOSI EISAGOGIS ARTIOY
    MES_PER DB 10,13,"O Arithmos einai peritos",10,13,"$"   ;MINIMA GIA THN PERIPTOSI EISAGOGIS PERITOY
    
DEDOMENA ENDS


    END ARXI 