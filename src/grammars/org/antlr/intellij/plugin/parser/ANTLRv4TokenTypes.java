package org.antlr.intellij.plugin.parser;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.intellij.plugin.ANTLRv4TokenType;

public interface ANTLRv4TokenTypes {
  IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
  IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;

  ANTLRv4TokenType EOF = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType TOKEN_REF = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType RULE_REF = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType LEXER_CHAR_SET = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType DOC_COMMENT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType BLOCK_COMMENT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType LINE_COMMENT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType DOUBLE_QUOTE_STRING_LITERAL = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType BEGIN_ARG_ACTION = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType OPTIONS = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType TOKENS = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType IMPORT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType FRAGMENT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType LEXER = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType PARSER = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType GRAMMAR = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType PROTECTED = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType PUBLIC = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType PRIVATE = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType RETURNS = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType LOCALS = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType THROWS = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType CATCH = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType FINALLY = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType MODE = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType COLON = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType COLONCOLON = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType COMMA = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType SEMI = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType LPAREN = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType RPAREN = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType RARROW = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType LT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType GT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType ASSIGN = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType QUESTION = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType STAR = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType PLUS = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType PLUS_ASSIGN = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType OR = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType DOLLAR = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType DOT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType RANGE = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType AT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType POUND = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType NOT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType RBRACE = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType ID = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType INT = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType STRING_LITERAL = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType WS = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType ERRCHAR = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType ARG_ACTION = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType ACTION = new ANTLRv4TokenType("ANTLRv4TokenType");
  ANTLRv4TokenType BEGIN_ACTION = new ANTLRv4TokenType("ANTLRv4TokenType");

  TokenSet COMMENTS = TokenSet.create(DOC_COMMENT,BLOCK_COMMENT,LINE_COMMENT);
  TokenSet WHITESPACES = TokenSet.create(WS);
}