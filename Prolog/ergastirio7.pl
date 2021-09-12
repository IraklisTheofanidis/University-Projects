word([h,e,l,l,o]).
word([m,a,n]).
word([w,o,m,a,n]).
word([b,o,o,k]).
word([m,o,t,h,e,r]).
word([c,o,m,p,u,t,e,r]).
word([c,a,r]).
word([p,r,o,l,o,g]).
word([p,e,n,c,i,l]).
word([t,a,b,l,e]).

append([],L,L).
append([H|L1],L2,[H|L3]) :-
	append(L1,L2,L3).


changeletter(Word,CorrectWord) :-
	append(Begin,[Letter|End],Word),
	word(CorrectWord),
	append(Begin,[Letter1|End],CorrectWord),
	Letter1 \= Letter.
	
	
swapletters(W,CW):-
	append(Begin,[L0,L1|E],W),
	word(CW),
	append(Begin,[L1,L0|E],CW),
	word(CW).


exchangeletters(W,CW) :-
	append(A,[X|D], W),
	append(B,[Y|C], D),
	word(CW),
	append(A,[Y|NW],CW),
	append(B,[X|C],NW),
	word(CW).  

	
		
