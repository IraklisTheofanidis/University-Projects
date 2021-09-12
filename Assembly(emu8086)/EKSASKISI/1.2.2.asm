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
        
        MOV BL,2
        MUL BL
        
        MOV BX,AX
        
        MOV AL,N1
        MOV CL,3
        MUL CL
        
        SUB BX,AX
        
        ADD BL,5 
        
        MOV AX,BX                  ;STHN OUSIA AUTES OI 4 ENTOLES EINAI STANDAR KATHE FORA POU THELOUME NA EMFANISOUME DIPSIFIO
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
    N1 DB 5
    N2 DB 2 
    N3 DB 1
    N4 DB 1
    MINIMA DB "TO ATHISMA EINAI: $"
DEDOMENA ENDS


    END ARXI 