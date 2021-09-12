figure(1,middle(trigono,tetragono)).
figure(2,middle(kiklos,trigono)).
figure(3,middle(tetragono,kiklos)).
figure(4,middle(tetragono,tetragono)).
figure(5,middle(tetragono,trigono)).
figure(6,middle(trigono,kiklos)).
figure(7,middle(kiklos,tetragono)).
figure(8,middle(trigono,trigono)).
figure(9,bottomleft(kiklos,kiklos)).
figure(10,topleft(kiklos,kiklos)).
figure(11,bottomright(kiklos,kiklos)).
figure(12,topright(kiklos,kiklos)).
figure(13,bottomleft(tetragono,tetragono)).
figure(14,topleft(tetragono,tetragono)).
figure(15,bottomright(tetragono,tetragono)).
figure(16,topright(tetragono,tetragono)).


relation(middle(S1,S2),middle(S2,S1),inverse). 
relation(middle(S1,S2),middle(S1,S3),changeout) :-
	S2\=S3.
relation(middle(S2,S1),middle(S3,S1),changein) :-
	S2\=S3.
	
relation(topleft(S1,S2),topright(S1,S2),irmirror).
relation(topright(S1,S2),bottomright(S1,S2),tbmirror).

relation(topright(S1,S2),bottomleft(S1,S2),diagmirror).

analogy(S1,S2,S3,S4) :-
	figure(S1,SximaA),
	figure(S2,SximaB),
	relation(SximaA,SximaB,R),
	
	figure(S3,SximaG),
	figure(S4,SximaD),
	relation(SximaG,SximaD,R).



