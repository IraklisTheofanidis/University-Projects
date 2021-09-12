and(0,0,0).
and(0,1,0).
and(1,0,0).
and(1,1,1).

or(0,0,0).
or(0,1,1).
or(1,0,1).
or(1,1,1).

xor(0,0,0).
xor(0,1,1).
xor(1,0,1).
xor(1,1,0).


halfadder(A,B,C,S) :-
	xor(A,B,S),
	and(A,B,C).

fulladder(A,B,Cin,Cout,S) :-
	halfadder(A,B,C1,Si),
	halfadder(Si,Cin,Cii,S),
	or(Cii,C1,Cout).

bit(CIN,X0,Y0,X1,Y1,X2,Y2,S0,S1,S2,COUT) :-
	fulladder(X0,Y0,CIN,COUT1,S0),
	fulladder(X1,Y1,COUT1,COUT2,S1),
	fulladder(X2,Y2,COUT2,COUT,S2).



%listing(bit).






