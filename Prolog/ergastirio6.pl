append([],L,L).
append([H|L1],L2,[H|L3]) :-
	append(L1,L2,L3).
	

reverse([],[]).
reverse([H|T],L) :-
	reverse(T,L1),
	append(L1,[H],L).
	
	
melos(H,[H|_]).
melos(X,[H|T]) :-
	X\=H,
	melos(X,T).
	
	
ponseg([],[],[]).
ponseg([H|A],[H|X],Y) :-
	H>=0,
	ponseg(A,X,Y).
	
ponseg([H|A],X,[H|Y]) :-
	H<0,
	ponseg(A,X,Y).