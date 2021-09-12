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
        ADD AL,N2   
        
        MOV BL,N3
        SUB BL,N4 
        
               
        
        
        MUL BL 
        
        MOV BL,10
        DIV BL
          
        
       ; MOV CL,10
       ; DIV CL
             
                  
        MOV CX,AX
        
        
        
        
        MOV DL,CL
        ADD DL,48
        MOV AH,2
        INT 21H  
        
         MOV DL,CH
        ADD DL,48
        MOV AH,2
        INT 21H
        
    
        MOV AH,4CH
        INT 21H
	
KODIKAS ENDS

DEDOMENA SEGMENT  
    N1 DB 2
    N2 DB 1
    N3 DB 4
    N4 DB 1
    MINIMA DB "TO APOTELESMA EINAI: $"
DEDOMENA ENDS


    END ARXI