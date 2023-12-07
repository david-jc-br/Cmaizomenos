grammar CmzmLang;

// Fragments
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];
fragment ALFANUM: [a-zA-Z0-9];


WS: [ \r\t\n]+ -> skip;
PalavraChave: 'si' | 'sinaum' | 'uai' | 'trem' | 'vazio' | 'vorta' | 'mostraissu' | 'leissu' | ';';
Tipo: 'Int' | 'Real' | 'Bool' | 'String';
OpArit: '+' | '-' | '*' | '/' ;
Atribuicao: '=';
OpRel: '>' | '<' | '>=' | '<=' | '==' | '!=';
AbreChave: '{';
FechaChave: '}';
AbrePar: '(';
FechaPar: ')';
Comentario: '/*' .*? '*/' -> skip;
OpBoolE: '&&';
OpBoolOu: '||';
Var: LETRA ALFANUM*;
NInt: DIGITO+;
NReal: DIGITO+ '.' DIGITO+;
LString: '"' (LETRA | DIGITO | ' ' | '!' | '@' | '#' | '$' | '%' | '&' | '~')* '"';
ErrorChar: .;
Delimitador: '::';

procedimento: 'trem' 'vazio' AbrePar parametros? FechaPar AbreChave comando* FechaChave;

funcao: 'trem' Tipo Delimitador Var AbrePar parametros? FechaPar AbreChave comando* 'vorta' expressao FechaChave;

parametros: Tipo Delimitador Var (',' Tipo Delimitador Var)*;

comando: expressao comando | expressao;
expressao: declaracaoVar | condicional | repeticao | atribuicao | mostraissu;

declaracaoVar: Tipo Delimitador Var ';' | Tipo Delimitador atribuicao ;

condicional: 'si' AbrePar expressaoLogica FechaPar AbreChave expressao+ FechaChave ( 'sinaum' AbreChave expressao+ FechaChave);

repeticao: 'uai' AbrePar expressaoLogica FechaPar AbreChave expressao+ FechaChave;

expressaoLogica: Var OpRel Var | expressaoLogicaString | expressaoLogicaInt | expressaoLogicaReal;
expressaoLogicaString: Var OpRel LString | LString OpRel Var | LString OpRel LString;
expressaoLogicaInt: Var OpRel NInt | NInt OpRel Var | NInt OpRel NInt;
expressaoLogicaReal: Var OpRel NReal | NReal OpRel Var | NReal OpRel NReal;

atribuicao: atribuicaoString | atribuicaoInt | atribuicaoReal ;
atribuicaoString: Var Atribuicao (LString | expressaoAritString) ';';
atribuicaoInt: Var Atribuicao (NInt | expressaoAritInt) ';';
atribuicaoReal: Var Atribuicao (NReal | expressaoAritReal) ';';

mostraissu: 'mostraissu' AbrePar (LString | Var | WS | NInt |NReal)+ FechaPar ';';

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

expressaoAritString:
  LString '+' LString
  | Var '+' LString
  | LString '+' Var
  | Var '+' Var
  | Var '+' expressaoAritString
  | LString '+' expressaoAritString
  | expressaoAritString '+' Var
  | expressaoAritString '+' LString
  | expressaoAritString '+' expressaoAritString;