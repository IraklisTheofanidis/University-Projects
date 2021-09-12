TITLE SIMPLE_ADD
KODIKAS SEGMENT
    ASSUME CS:KODIKAS, DS:DEDOMENA
    ARXI:   
        MOV AX,DEDOMENA	
	    MOV DS,AX	

        LEA DX,MINIMA
        MOV AH,9
        INT 21H
        
       
        MOV AL,N1
        MUL AL
        
        
        MOV BX,AX
        
        MOV AL,N1
        MOV CL,2
        MUL CL
        
        SUB BX,AX 
        
        MOV AX,BX   
           
           
        MOV CL,10
        DIV CL
        
         
        MOV BX,AX 
         
        MOV DL,BL
        ADD DL,48
        MOV AH,2
        INT 21H  
        
         MOV DL,BH
         ADD DL,48
         MOV AH,2
         INT 21H
    
        MOV AH,4CH
        INT 21H
	
KODIKAS ENDS

DEDOMENA SEGMENT  
    N1 DB 5
    MINIMA DB "TO APOTELESMA EINAI: $"
DEDOMENA ENDS


    END ARXI