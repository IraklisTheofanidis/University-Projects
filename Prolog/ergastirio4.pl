natural(0).

natural(X) :-
	X>0,
	X1 is X-1,
	natural(X1).
	
	
power(X,0,1).	

power(X,N,P) :-
	N>0,
	N1 is N-1,
	power(X,N1,P1),
	P is P1*X.
	
fibo(1,1).
fibo(2,1).
	
fibo(N,Y) :-
	N>2,
	N1 is N-1,
	N2 is N-2,
	fibo(N1,Y1),
	fibo(N2,Y2),
	Y is Y1+Y2.

mkd(N,0,N).	
mkd(N,M,X) :-
	N<M,
	MKD(M,N,X).
mkd(N,M,X) :-
	N>=M,
	M1 is mod(N,M),
	mkd(M,M1,X).
	

run :-
write('dwse enan arithmo'),
read(N1),
nl,
write('dwse TWRA enan akoma arithmo'),
read(N2),
nl,
write('i dinami N1^N2 einai'),
power(N1,N2,P),
write(P).

	
	
	
	

	
	



