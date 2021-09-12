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
        MOV BL,N2
        ADD AL,BL
        
        MUL AL 
        MOV BX,AX
        
        MOV AL,N3
        MOV CL,N4
        ADD AL,CL
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
    N1 DB 2
    N2 DB 2 
    N3 DB 1
    N4 DB 1
    MINIMA DB "TO ATHISMA EINAI: $"
DEDOMENA ENDS


    END ARXI 