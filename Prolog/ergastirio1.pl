parent(cronus,hestia).
parent(cronus,hades).
parent(cronus,poseidon).
parent(cronus,zeus).
parent(cronus,demeter).
parent(rhea,hestia).
parent(rhea,hades).
parent(rhea,poseidon).
parent(rhea,zeus).
parent(rhea,demeter).
parent(zeus,athena).
parent(zeus,ares).
parent(zeus,hebe).
parent(zeus,hephaestus).
parent(zeus,persephone).
parent(hera,athena).
parent(hera,ares).
parent(hera,hebe).
parent(hera,hephaestus).
parent(demeter,persephone).
 
male(cronus).
male(hades).
male(poseidon).
male(zeus).
male(ares).
male(hephastus).
 
female(rhea).
female(hestia).
female(hera).
female(demeter).
female(persephone).
female(athena).
female(hebe).
 
diff(X,Y) :-
    X \= Y.
     
son(X,Y) :- %X=gios kai to y einai oi pateres
    male(X),
    parent(Y,X).
 
daughter(X,Y) :-
    female(X),
    parent(Y,X).
     
father(X,Y) :-
        male(X),
        parent(X,Y).
         
mother(X,Y) :-
        female(X),
        parent(X,Y).
         
grandfather(X,Z) :-
        father(X,Y),
        parent(Y,Z).
         
grandmother(X,Z) :- 
        mother(X,Y),
        parent(Y,Z).
 
brother(X,Y) :-
        male(X),
        parent(Z,X),
        parent(Z,Y),
        X\=Y.
         
sister(X,Y) :-
        female(X),
        parent(Z,X),
        parent(Z,Y),
        X\=Y.
         
uncle(X,Y) :-
         
        brother(X,Z),
        parent(Z,Y).
         
aunt(X,Y) :-
         
        sister(X,Z),
        parent(Z,Y).
         
         
 
