grammar CmzmLang;

// Fragments
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];
fragment ALFANUM: [a-zA-Z0-9];

PalavraChave: 'DEC' | 'PROG' | 'si' | 'sinaum' | 'uai' | 'trem' | 'Proc' | 'Vorta' | 'Mostraissu' | 'Leissu' | ';';
Tipo: 'Int' | 'Real' | 'Bool' | 'String';
OpArit: '+' | '-' | '*' | '/';
Atribuicao: '=';
OpRel: '>' | '<' | '>=' | '<=' | '==' | '!=';
AbreChave: '{';
FechaChave: '}';
AbrePar: '(';
FechaPar: ')';
AbreComentario: '/*';
FechaComentario: '*/';
OpBoolE: '&&';
OpBoolOu: '||';
WS: [ \r\t\n]+ -> skip;
Var: LETRA ALFANUM*;
NInt: DIGITO+;
NReal: DIGITO+ '.' DIGITO+;
LString: '"' ALFANUM+ '"';
ErrorChar: .;

comando: expressao comando | expressao;
expressao: declaracaoVar | condicional | repeticao | atribuicao;

declaracaoVar: Tipo Var ';';

// Expressões Condicionais (si | si sinaum)
condicional: 'si' AbrePar expressaoLogica FechaPar AbreChave expressao FechaChave ( 'sinaum' AbreChave expressao FechaChave)?;

// Repetição (Uai)
repeticao: 'uai' AbrePar expressaoLogica FechaPar AbreChave expressao FechaChave;

// Expressões Lógicas
expressaoLogica: Var OpRel Var | expressaoLogicaString | expressaoLogicaInt | expressaoLogicaReal;
expressaoLogicaString: Var OpRel LString | LString OpRel Var | LString OpRel LString;
expressaoLogicaInt: Var OpRel NInt | NInt OpRel Var | NInt OpRel NInt;
expressaoLogicaReal: Var OpRel NReal | NReal OpRel Var | NReal OpRel NReal;

// Atribuição
atribuicao: atribuicaoString | atribuicaoInt | atribuicaoReal;
atribuicaoString: Var Atribuicao LString ';';
atribuicaoInt: Var Atribuicao (NInt | expressaoAritInt) ';';
atribuicaoReal: Var Atribuicao (NReal | expressaoAritReal) ';';

//Expressoes Aritimeticas
expressaoAritInt:
  NInt OpArit NInt
  | Var OpArit NInt
  | NInt OpArit Var
  | Var OpArit Var
  | Var OpArit expressaoAritInt
  | NInt OpArit expressaoAritInt
  | expressaoAritInt OpArit Var
  | expressaoAritInt OpArit NInt
  | expressaoAritInt OpArit expressaoAritInt;

expressaoAritReal:
  NReal OpArit NReal
  | Var OpArit NReal
  | NReal OpArit Var
  | Var OpArit Var
  | Var OpArit expressaoAritReal
  | NReal OpArit expressaoAritReal
  | expressaoAritReal OpArit Var
  | expressaoAritReal OpArit NReal
  | expressaoAritReal OpArit expressaoAritReal;


