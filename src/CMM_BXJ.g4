grammar CMM_BXJ;  //this is a test

input
    :   stat*;

stat_block
    :   LEFT_CURLY stat* RIGHT_CURLY
    |   stat
    ;

stat
    :   assign_stat SEMICOLON
    |   read_stat SEMICOLON
    |   write_stat SEMICOLON
    |   if_stat
    |   while_stat
    |   declare_stat SEMICOLON
    |   declare_assign_stat SEMICOLON
    |   break_stat SEMICOLON
    |   cont_stat SEMICOLON
    |   other_stat SEMICOLON
    ;

declare_stat:   type (id|array_id) (COMMA(id|array_id))*;
assign_stat
    :   (id|array_id) EQUAL (expr|array_expr)
    ;
declare_assign_stat
    :   type id (EQUAL expr)? (COMMA id (EQUAL expr)?)*
    |   type array_id (EQUAL array_expr)? (COMMA array_id (EQUAL array_expr)?)*
    ;
read_stat:      READ LEFT_PAREN (id|array_id) RIGHT_PAREN;
write_stat:     WRITE LEFT_PAREN expr (COMMA expr)* RIGHT_PAREN;
if_stat
    :   IF LEFT_PAREN bool_expr RIGHT_PAREN stat_block (ELSEIF LEFT_PAREN bool_expr RIGHT_PAREN stat_block)*(ELSE stat_block)?
    ;
while_stat
    :   WHILE LEFT_PAREN expr RIGHT_PAREN stat_block;
break_stat:     BREAK;
cont_stat:      CONTINUE;
other_stat:     (id|array_id) ( PP | MM );


expr
    :   num_expr
    |   bool_expr
    |   char_expr
    ;

array_expr
    :   num_array_expr
    |   char_array_expr
    |   bool_array_expr
    ;

num_array_expr
    :   LEFT_CURLY (INT|DOUBLE) (COMMA (INT|DOUBLE))* RIGHT_CURLY
    ;

char_array_expr
    :   LEFT_CURLY CHAR (COMMA CHAR)* RIGHT_CURLY
    |    QUOTE   ( ESCAPED_QUOTE | NO_ENTER )*?  QUOTE
    ;

bool_array_expr
    :   LEFT_CURLY BOOL (COMMA BOOL)* RIGHT_CURLY
    ;

num_expr          //expression that return double
    :   LEFT_PAREN num_expr RIGHT_PAREN #num_expr_paren
    |   MINUS num_expr      #num_expr_minus
    |   num_expr op=(MULT|DIVI|MOD) num_expr     #num_expr_op
    |   num_expr op=(PLUS|MINUS|MM) num_expr      #num_expr_op
    |   INT     #num_expr_other
    |   DOUBLE  #num_expr_other
    |   array_id    #num_expr_other
    |   id  #num_expr_other
    ;

bool_expr             //expression that return true or false
    :   LEFT_PAREN bool_expr RIGHT_PAREN
    |    LOGIC_NOT   bool_expr
    |   bool_expr BOOL_OP bool_expr
    |   num_expr COMPARE_OP num_expr
    |   BOOL
    |   array_id
    |   id
    ;

char_expr         //expression that return character
    :   CHAR
    |   array_id
    |   id
    ;

type
    :   T_INT
    |   T_DOUBLE
    |   T_CHAR
    |   T_BOOL
    ;

array_id:   ID array_tail;
array_tail:    LEFT_BRACKET num_expr RIGHT_BRACKET ;

id:     ID;

T_INT:  'int';
T_DOUBLE:   'double';
T_CHAR: 'char';
T_BOOL: 'bool';

IF
    :   'if' ;
ELSE
    :   'else' ;
ELSEIF
    :   ELSE IF ;
WHILE
    :   'while';
BREAK
    :   'break';
CONTINUE
    :   'continue';
READ
    :   'read';
WRITE
    :   'write';

BOOL
    :   'true'
    |   'false'
    ;


ID
    :   LETTER(LETTER|[0-9])*
    |   LETTER('_'|LETTER|[0-9])*(LETTER|[0-9])
    ;


MULT:'*';
DIVI:'/';
MOD:'%';


PLUS:'+';
MINUS:'-';          //Ãÿ ‚«Èøˆ£∫ºı∫≈”Î∏∫∫≈≥ÂÕª

COMPARE_OP
    :   ('<'|'>'|'<='|'>='|'!='|'==');

BOOL_OP
    :   ('&&'|'||');

CHAR
    :   '\'' ~('\n'|'\r' ) '\''
    ;


DOUBLE
    :   DECIMAL '.' [0-9]*
    ;


INT
    :   DECIMAL
    |   HEXADECIMAL
    ;

LEFT_CURLY:     '{';
RIGHT_CURLY:    '}';
LEFT_PAREN:     '(';
RIGHT_PAREN:    ')';
LEFT_BRACKET:   '[';
RIGHT_BRACKET:  ']';
EQUAL:          '=';
LOGIC_NOT:      '!';
COMMA:          ',';
SEMICOLON :     ';';
PP:             '++';
MM:             '--';
QUOTE:          '"';
ESCAPED_QUOTE:  '\\"';



fragment LETTER: [a-zA-Z] ;

fragment DECIMAL
    :   '0' | [1-9] [0-9]*; // no leading zeros,space inside is allowed

fragment  HEXADECIMAL
            :   '0x'([0-9]|[a-f])+
            |   '0X'([0-9]|[A-F])+
            ;

MULTI_COMMENT:'/*'.*?'*/' ->skip;   //∑«Ã∞¿∑∆•≈‰
SINGL_COMMENT:'//' ~([\r]|[\n])*[\r]?([\n]|EOF) ->skip;
WS  :   [ \t\n\r]+ ->skip;
NO_ENTER: ~('\r'|'\n');
