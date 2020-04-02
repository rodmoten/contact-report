package io.swagger.api;

import io.swagger.model.Contributor;
import io.swagger.model.ContributorKey;
import io.swagger.model.ModelApiResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T09:57:33.700Z")

@Controller
public class RegisterApiController implements RegisterApi {

    private static final Logger log = LoggerFactory.getLogger(RegisterApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RegisterApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ContributorKey>> register(@ApiParam(value = "Register person to contribute data" ,required=true )  @Valid @RequestBody Contributor body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ContributorKey>>(objectMapper.readValue("[ {  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"}, {  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ContributorKey>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ContributorKey>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
