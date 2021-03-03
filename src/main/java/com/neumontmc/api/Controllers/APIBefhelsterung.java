package com.neumontmc.api.Controllers;

import com.neumontmc.api.Models.APIRemotes;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.io.IOException;

public class APIBefhelsterung {
    private final APIRemotes APIRemotes = new APIRemotes();

    /**
     * Get basic user information from the API server.
     *
     * @return HttpResponse<String> containing a JSON body.
     * @throws IOException if getting a response from the target APIRemotes URL results in error.
     */
    public HttpResponse<String> getUsers() throws IOException {
        return getAPIResponse(APIRemotes.getBasic_user_information_URL());
    }

    /**
     * Get comprehensive user stats information from the API server.
     *
     * @return HttpResponse<String> containing a JSON body.
     * @throws IOException if getting a response from the target APIRemotes URL results in error.
     */
    public HttpResponse<String> getUserStats() throws IOException {
        return getAPIResponse(APIRemotes.getComprehensive_user_information_URL());
    }

    /**
     * Get comprehensive mcmmo stats information.
     *
     * @return HttpResponse<String> containing a JSON body.
     * @throws IOException if getting a response from the APIRemotes URL results in error.
     */
    public HttpResponse<String> getMcmmoStats() throws IOException {
        return getAPIResponse(APIRemotes.getUser_mcmmo_levels_info_URL());
    }

    /**
     * Get a <String> response from the API server.
     *
     * @param URL Valid NUMC API URL
     * @return HttpResponse<String> JSON body response.
     * @throws IOException if getting a response from the target URL results in error.
     */
    private HttpResponse<String> getAPIResponse(String URL) throws IOException {
        Unirest uni = new Unirest();
        //Get the JSON string from the API server
        HttpResponse<String> response = uni.get(URL).asString();
        return response;
    }

    @Deprecated
    public com.neumontmc.api.Models.APIRemotes getAPIRemotes() {
        return APIRemotes;
    }
}
