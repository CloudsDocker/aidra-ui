/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.microsoft.azure.simpletodo.api;

import com.microsoft.azure.simpletodo.model.TodoList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "Lists", description = "the Lists API")
public interface ListsApi {
    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /lists : Creates a new Todo list
     *
     * @param todoList The Todo List (optional)
     * @return A Todo list result (status code 201)
     *         or Invalid request schema (status code 400)
     */
    @Operation(
        operationId = "createList",
        summary = "Creates a new Todo list",
        tags = { "Lists" },
        responses = {
            @ApiResponse(
                responseCode = "201",
                description = "A Todo list result",
                content = { @Content(mediaType = "application/json", schema = @Schema(implementation = TodoList.class)) }
            ),
            @ApiResponse(responseCode = "400", description = "Invalid request schema"),
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/lists",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<TodoList> createList(
        @Parameter(name = "TodoList", description = "The Todo List") @Valid @RequestBody(required = false) TodoList todoList
    ) {
        getRequest()
            .ifPresent(request -> {
                for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * DELETE /lists/{listId} : Deletes a Todo list by unique identifier
     *
     * @param listId The Todo list unique identifier (required)
     * @return Todo list deleted successfully (status code 204)
     *         or Todo list not found (status code 404)
     */
    @Operation(
        operationId = "deleteListById",
        summary = "Deletes a Todo list by unique identifier",
        tags = { "Lists" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Todo list deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Todo list not found"),
        }
    )
    @RequestMapping(method = RequestMethod.DELETE, value = "/lists/{listId}")
    default ResponseEntity<Void> deleteListById(
        @Parameter(name = "listId", description = "The Todo list unique identifier", required = true) @PathVariable(
            "listId"
        ) String listId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /lists/{listId} : Gets a Todo list by unique identifier
     *
     * @param listId The Todo list unique identifier (required)
     * @return A Todo list result (status code 200)
     *         or Todo list not found (status code 404)
     */
    @Operation(
        operationId = "getListById",
        summary = "Gets a Todo list by unique identifier",
        tags = { "Lists" },
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "A Todo list result",
                content = { @Content(mediaType = "application/json", schema = @Schema(implementation = TodoList.class)) }
            ),
            @ApiResponse(responseCode = "404", description = "Todo list not found"),
        }
    )
    @RequestMapping(method = RequestMethod.GET, value = "/lists/{listId}", produces = { "application/json" })
    default ResponseEntity<TodoList> getListById(
        @Parameter(name = "listId", description = "The Todo list unique identifier", required = true) @PathVariable(
            "listId"
        ) String listId
    ) {
        getRequest()
            .ifPresent(request -> {
                for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /lists : Gets an array of Todo lists
     *
     * @param top The max number of items to returns in a result (optional, default to 20)
     * @param skip The number of items to skip within the results (optional, default to 0)
     * @return An array of Todo lists (status code 200)
     */
    @Operation(
        operationId = "getLists",
        summary = "Gets an array of Todo lists",
        tags = { "Lists" },
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "An array of Todo lists",
                content = { @Content(mediaType = "application/json", schema = @Schema(implementation = TodoList.class)) }
            ),
        }
    )
    @RequestMapping(method = RequestMethod.GET, value = "/lists", produces = { "application/json" })
    default ResponseEntity<List<TodoList>> getLists(
        @Parameter(name = "top", description = "The max number of items to returns in a result") @Valid @RequestParam(
            value = "top",
            required = false,
            defaultValue = "20"
        ) BigDecimal top,
        @Parameter(name = "skip", description = "The number of items to skip within the results") @Valid @RequestParam(
            value = "skip",
            required = false,
            defaultValue = "0"
        ) BigDecimal skip
    ) {
        getRequest()
            .ifPresent(request -> {
                for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * PUT /lists/{listId} : Updates a Todo list by unique identifier
     *
     * @param listId The Todo list unique identifier (required)
     * @param todoList The Todo List (optional)
     * @return A Todo list result (status code 200)
     *         or Todo list not found (status code 404)
     *         or Todo list is invalid (status code 400)
     */
    @Operation(
        operationId = "updateListById",
        summary = "Updates a Todo list by unique identifier",
        tags = { "Lists" },
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "A Todo list result",
                content = { @Content(mediaType = "application/json", schema = @Schema(implementation = TodoList.class)) }
            ),
            @ApiResponse(responseCode = "404", description = "Todo list not found"),
            @ApiResponse(responseCode = "400", description = "Todo list is invalid"),
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/lists/{listId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<TodoList> updateListById(
        @Parameter(name = "listId", description = "The Todo list unique identifier", required = true) @PathVariable(
            "listId"
        ) String listId,
        @Parameter(name = "TodoList", description = "The Todo List") @Valid @RequestBody(required = false) TodoList todoList
    ) {
        getRequest()
            .ifPresent(request -> {
                for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
