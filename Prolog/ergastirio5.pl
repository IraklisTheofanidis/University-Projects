sum([],0).
sum([H|T],S) :-
	sum(T,ST),
	S is ST + H.
	
	
teleutaio([H],H).
teleutaio([H|T],Last) :-
	teleutaio(T,LastT),
	Last is LastT.
	
	
melos(H,[H|_]).
melos(X,[H|T]) :-
	X\=H,
	melos(X,T).
	

	
element([H|T],1,H).
element([H|T],N,X) :-
	/*N>0, */
	N1 is N-1,
	element(T,N1,X1),
	X1 = X.
	

max([X],X).
max([H|T],MAX) :-
	max(T,MAXT),
	H> MAXT,
	MAX=H.
max([H|T],MAX) :-
	max(T,MAXT),
	H<=MAXT,
	MAX=MAXT.