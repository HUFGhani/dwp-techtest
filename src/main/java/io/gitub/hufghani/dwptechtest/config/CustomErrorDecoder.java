package io.gitub.hufghani.dwptechtest.config;

import feign.Response;
import feign.codec.ErrorDecoder;
import io.gitub.hufghani.dwptechtest.exception.BadRequestException;
import io.gitub.hufghani.dwptechtest.exception.NotFoundException;

public class CustomErrorDecoder implements ErrorDecoder {
  @Override
  public Exception decode(String methodKey, Response response) {

    switch (response.status()) {
      case 400:
        return new BadRequestException();
      case 404:
        return new NotFoundException();
      default:
        return new Exception("Generic error");
    }
  }
}
