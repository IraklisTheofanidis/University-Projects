                TITLE SIMPLE_ADD
KODIKAS SEGMENT
    ASSUME CS:KODIKAS, DS:DEDOMENA
    ARXI:   
        MOV AX,DEDOMENA	
	    MOV DS,AX	

        LEA DX,MINIMA
        MOV AH,9
        INT 21H
        
        MOV AL,X
        MOV BL,2
        SUB AL,BL 
        
        MUL AL
        
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
    X DB 7
    
    MINIMA DB "TO ATHISMA EINAI: $"
DEDOMENA ENDS


    END ARXI