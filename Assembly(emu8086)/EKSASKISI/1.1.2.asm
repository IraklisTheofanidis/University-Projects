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
       MOV CL,N2
       MUL CL
        
       MOV CL,N3
       ADD CL,N4
       
      SUB AL,CL 
        
      
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
    N1 DB 4
    N2 DB 3
    N3 DB 4
    N4 DB 1
    MINIMA DB "TO APOTELESMA EINAI: $"
DEDOMENA ENDS


    END ARXI