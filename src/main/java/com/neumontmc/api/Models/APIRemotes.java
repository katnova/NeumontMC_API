package com.neumontmc.api.Models;

import java.io.Serializable;

public class APIRemotes implements Serializable {
    //Remote server vars
    private final String remote_protocol = "https://";
    private final String remote_base = "api.neumontmc.com";

    //Compose remote URL
    private final String remoteURL = remote_protocol + remote_base;

    //Available API versions
    private final String api_version_1 = "/vEin";
    private final String api_version_2 = "/vZwei";

    //API URL vars


    private final String basic_user_information = "/users";
    private final String basic_user_information_apiVersion = api_version_2;
    private final String comprehensive_user_information = "/user-stats";
    private final String comprehensive_user_information_apiVersion = api_version_2;
    private final String user_mcmmo_levels_info = "/mcmmo-stats";
    private final String user_mcmmo_levels_info_apiVersion = api_version_2;

    //Available API URLs'
    private final String basic_user_information_URL = remoteURL + basic_user_information_apiVersion + basic_user_information;
    private final String comprehensive_user_information_URL = remoteURL + comprehensive_user_information_apiVersion + comprehensive_user_information;
    private final String user_mcmmo_levels_info_URL = remoteURL + user_mcmmo_levels_info_apiVersion + user_mcmmo_levels_info;

    //Deprecated API Urls
    @Deprecated
    private final String userAndMcmmoInformation = "/users";
    @Deprecated
    private final String userAndMcmmoInformation_api = api_version_1;
    @Deprecated
    private final String userAndMcmmoInformation_URL = remoteURL + userAndMcmmoInformation_api + userAndMcmmoInformation;

    /**
     * Get the URL to make the API call for basic user information
     *
     * @return String URL
     */
    public String getBasic_user_information_URL() {
        return basic_user_information_URL;
    }


    /**
     * Get the URL to make the API call for detailed user stats
     *
     * @return String URL
     */
    public String getComprehensive_user_information_URL() {
        return comprehensive_user_information_URL;
    }


    /**
     * Get the URL to make the API call for mcmmo skill stats
     *
     * @return String URL
     */
    public String getUser_mcmmo_levels_info_URL() {
        return user_mcmmo_levels_info_URL;
    }

    /**
     *  Get Basic User Information and mcmmo stats URL.
     * @return String URL
     */
    @Deprecated
    public String userAndMcmmoInformation_URL() {
        return userAndMcmmoInformation_URL;
    }

    /**
     * Get a string containing all the vars used in building URL Strings.
     * @return String containing all the vars in the APIRemotes model for debugging/reference purposes.
     */
    @Override
    public String toString() {
        return "APIRemotes{" +
                "\n remote_protocol='" + remote_protocol + '\'' +
                ",\n remote_base='" + remote_base + '\'' +
                ",\n remoteURL='" + remoteURL + '\'' +
                ",\n api_version_1='" + api_version_1 + '\'' +
                ",\n api_version_2='" + api_version_2 + '\'' +
                ",\n basic_user_information='" + basic_user_information + '\'' +
                ",\n basic_user_information_apiVersion='" + basic_user_information_apiVersion + '\'' +
                ",\n comprehensive_user_information='" + comprehensive_user_information + '\'' +
                ",\n comprehensive_user_information_apiVersion='" + comprehensive_user_information_apiVersion + '\'' +
                ",\n user_mcmmo_levels_info='" + user_mcmmo_levels_info + '\'' +
                ",\n user_mcmmo_levels_info_apiVersion='" + user_mcmmo_levels_info_apiVersion + '\'' +
                ",\n basic_user_information_URL='" + basic_user_information_URL + '\'' +
                ",\n comprehensive_user_information_URL='" + comprehensive_user_information_URL + '\'' +
                ",\n user_mcmmo_levels_info_URL='" + user_mcmmo_levels_info_URL + '\'' +
                '}';
    }
}
