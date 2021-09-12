TITLE SIMPLE_ADD
KODIKAS SEGMENT
    ASSUME CS:KODIKAS, DS:DEDOMENA
    ARXI:   
        MOV AX,DEDOMENA	
	    MOV DS,AX	

        LEA DX,MINIMA
        MOV AH,9
        INT 21H
        
        
        
       
        MOV CX,40
        LEA BX,BUFFER 
        LEA SI,BUFFER2
        
      
      
      ARXI_LEKSIS:   
         CMP AL,0dh    ;ELENXOS AN STIN ARXI TIS LEKSEIS PATISAME ENTER
        JE TELOS  
      
      
        SINEXEIA_LEKSIS:
       
           MOV AH,01h
           INT 21h   
           
           CMP AL,'A'
           JB AN_OXI  
            
           
           MOV BUFFER2[SI],AL
            
           
           
           
            
           
          
          
         AN_OXI:
           MOV [BX],AL 
      
         INC BX
         CMP AL,0dh
       Loopne SINEXEIA_LEKSIS
      
          
       TELOS:   
       
       LEA DX,BUFFER2
        MOV AH,9
        INT 21H
    
        MOV AH,4CH
        INT 21H
	
KODIKAS ENDS

DEDOMENA SEGMENT  
    N1 DB 4
    MINIMA DB "Dwse ena minima me latinikous xaraktires:",10,13,"$"
    BUFFER DB 40 dup(0)    
    BUFFER2 DB 40 dup(0)
DEDOMENA ENDS


    END ARXI 