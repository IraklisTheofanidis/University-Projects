TITLE SIMPLE_ADD
KODIKAS SEGMENT
    ASSUME CS:KODIKAS, DS:DEDOMENA
    ARXI:   
        MOV AX,DEDOMENA	
	    MOV DS,AX	

        LEA DX,MINIMA
        MOV AH,9
        INT 21H
  B1:       MOV SI,0 
         
  B2:       MOV AH,08H    	; Eisagoume xarakthra apo to plhktrologio me parallhlh emfanish
	    INT 21H
         
          
  B3:       CMP AL,13
           JE EMFANISI
           
           CMP AL,'A'
           JB B2
           
           CMP AL,'Z'
           JBE B7 
           
           CMP AL,'a'
           jb b2
           
           CMP AL,'z'
           JA B2
    
   B7:      
        MOV DL,AL
      ;  ADD DL,48
        MOV AH,2
        INT 21H
   
            
            
                
           MOV BUFFER[SI],AL
           
            ADD SI,1
           CMP SI,9
           JB B2
  
  
    EMFANISI: 
    
        LEA DX,MINIMA2
        MOV AH,9
        INT 21H
        
         SUB SI,1
         
        MOV BL,BUFFER[SI]  
        CMP BL,'Z'
        JA E7
        ADD BL,32 
        MOV DL,BL
        MOV AH,2
        INT 21H
         JMP E5
        
      E7:
        SUB BL,32  
        MOV DL,BL
        MOV AH,2
        INT 21H
  
     E5:      
           MOV CX,SI
            SUB SI,1
         
     LO: 
          MOV BL,BUFFER[SI]
           SUB SI,1
          
         MOV AH,2
        MOV dl,10	    
        INT 21h
        
        MOV AH,2
        MOV dl,32	    
        INT 21h
        
          
        CMP BL,'Z'
        JA E3
        ADD BL,32 
        MOV DL,BL
        MOV AH,2
        INT 21H
        JMP E4  
        
     E3:   
         
        SUB BL,32   
        MOV DL,BL
        MOV AH,2
        INT 21H 
        
      E4:     
      LOOP LO  
        
      
    
        MOV AH,4CH
        INT 21H
	
KODIKAS ENDS

DEDOMENA SEGMENT   
    BUFFER   DB 40 DUP(0) 
    N1 DB 2
    N2 DB 1
    N3 DB 4
    N4 DB 1
    MINIMA DB "TO APOTELESMA EINAI: ",10,13,"$" 
    MINIMA2 DB 10,13,"H METATROPI EINAI: ",10,13,"$"
DEDOMENA ENDS


    END ARXI