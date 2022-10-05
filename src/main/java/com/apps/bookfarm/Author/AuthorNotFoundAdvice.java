package com.apps.bookfarm.Author;

@ControllerAdvice
class AuthorNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(AuthorNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String authorNotFoundHandler(AuthorNotFoundException ex){
        return ex.getMessage();
    }
}
