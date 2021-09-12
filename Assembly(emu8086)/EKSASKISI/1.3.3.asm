    TITLE SIMPLE_ADD
KODIKAS SEGMENT
    ASSUME CS:KODIKAS, DS:DEDOMENA
    ARXI:   
        MOV AX,DEDOMENA	
	    MOV DS,AX	

        MOV AL,N
        ADD AL,1
        MUL AL
         
        MOV BX,AX 
        
        
        MOV AL,N 
        MOV CL,2
        MUL CL 
                 
                 
        
                 
                 
        MOV CX,AX
        MOV AX,BX    
        DIV CL 
        MOV BX,AX
        
        
        
        
        
        
        
        
     
                 
        LEA DX,MINIMA
        MOV AH,9
        INT 21H 
        
        MOV DL,BL
        ADD DL,48
        MOV AH,2
        INT 21H  
        
        
         LEA DX,MINIMA2
        MOV AH,9
        INT 21H
        
       MOV DL,BH
        ADD DL,48
        MOV AH,2
        INT 21H
        
    
        MOV AH,4CH
        INT 21H
	
KODIKAS ENDS

DEDOMENA SEGMENT  
    N DB 3
    
    MINIMA DB "TO PILIKO EINAI: ",10,13,"$"    
    MINIMA2 DB "TO IPOLIPO EINAI:",10,13,"$"
DEDOMENA ENDS


    END ARXI