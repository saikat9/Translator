/*
 ---Teradata SQL Parser Grammar
 ---Author: Sangam Mahto
 ---Start Date: 19-07-2019
 ---Project: Bigframe Translator - Cognizant
 
*/

grammar TDGrammar;

@header {
package com.cognizant.antlr4;
}

parse
 : ( sql_stmt_list | error )* EOF
;

error
 : UNEXPECTED_CHAR
{
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
}
;


sql_stmt_list
 :  (sql_stmt ';')+
 ;

 
sql_stmt
 : select_stmt
 ;
 
 select_stmt
 : select_expr ((K_MINUS|K_EXCEPT) select_expr)?
 ;
 
 select_expr
 : (K_SELECT|K_SEL) (((K_DISTINCT|K_ALL)   ((table_name DOT STAR DOT K_ALL)|(column_name DOT K_ALL)|( STAR DOT K_ALL))?)|top_expr)?
 select_list?
 from_clause?
 ;
 

 select_list
 : STAR
 | table_name DOT STAR
 | select_list_expr (COMMA select_list_expr)*
 ;
 
  select_list_expr
 : ( (expr (K_AS? expr_alias_name)?) | table_name DOT STAR )
 ;
 
  from_clause
 : K_FROM table_name table_alias_name?
 ;


 
    keyword
  :
   K_SELECT
  |K_SEL
  |K_DISTINCT
  |K_ALL
  |K_TOP
  |K_PERCENT
  |K_AS
  |K_FROM
  |K_MINUS
  ;
  
K_SEL: S E L;

K_SELECT: S E L E C T;

K_DISTINCT: D I S T I N C T;

K_ALL: A L L;

K_TOP: T O P;

K_PERCENT: P E R C E N T;

K_AS: A S;

K_FROM: F R O M;

K_MINUS: M I N U S;

K_EXCEPT: E X C E P T;

 SCOL : ';';
  
  DOT : '.';
  
  OPEN_PAR : '(';
  
  CLOSE_PAR : ')';
  
  COMMA : ',';
  
  ASSIGN : '=';
  
  STAR : '*';
  
  PLUS : '+';
  
  MINUS : '-';
  
  TILDE : '~';
  
  PIPE2 : '||';
  
  DIV : '/';
  
  MOD : '%';
  
  LT2 : '<<';
  
  GT2 : '>>';
  
  AMP : '&';
  
  PIPE : '|';
  
  LT : '<';
  
  LT_EQ : '<=';
  
  GT : '>';
  
  GT_EQ : '>=';
  
  EQ : '==';
  
  NOT_EQ1 : '!=';
  
  NOT_EQ2 : '<>';
  
  MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

  SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;
 
 UNEXPECTED_CHAR
 : .
 ;

 expr
 : literal_value
 | ( ( database_name '.' )? table_name '.' )? column_name 
 | function_name '(' ( expr ( ',' expr )* | '*' )? ')'
 | '(' expr ')'
 ;

 expr_alias_name
  : IDENTIFIER
  ;

 literal_value
 : NUMERIC_LITERAL
  | STRING_LITERAL
  ;

NUMERIC_LITERAL
 : INTEGER
 | DECIMAL
 ;

 top_expr
 : K_TOP (INTEGER|DECIMAL) K_PERCENT?
 ;

 INTEGER
 : [0-9]+
 ;

 DECIMAL
 : [0-9] '.' [0-9]*
 ;
 
STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;
 
  table_name
 : (database_name DOT)? IDENTIFIER
 ;

column_name
 : (table_name DOT)? IDENTIFIER
 ; 	
 
database_name
 : IDENTIFIER
 ;
 
table_alias_name
 : IDENTIFIER
 ;

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]*
 ;
 
 function_name
:IDENTIFIER;


fragment DIGIT : [0-9];
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];