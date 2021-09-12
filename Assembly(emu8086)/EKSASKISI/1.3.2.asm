                TITLE SIMPLE_ADD
KODIKAS SEGMENT
    ASSUME CS:KODIKAS, DS:DEDOMENA
    ARXI:   
        MOV AX,DEDOMENA	
	    MOV DS,AX	

        LEA DX,MINIMA
        MOV AH,9
        INT 21H
        
        MOV AL,N
        SUB AL,1
        
        MUL AL
        
        
        MOV BX,AX
        
        MOV AL,N
        ADD AL,3
        MOV CL,2
        MUL CL
        
        SUB BX,AX
        
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
        
    
        MOV AH,4CH
        INT 21H
	
KODIKAS ENDS

DEDOMENA SEGMENT  
    N DB 7
    
    MINIMA DB "TO ATHISMA EINAI: $"
DEDOMENA ENDS


    END ARXI