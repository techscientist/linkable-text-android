package com.github.fobid.linkabletext.view;

/**
 * Created by partner on 2016-11-17.
 */

public interface OnLinkClickListener {
    void onHashtagClick(String hashtag);

    void onMentionClick(String mention);

    void onEmailAddressClick(String email);

    void onWebUrlClick(String url);

    void onPhoneClick(String phone);

    void onDomainNameClick(String domainName);

    void onIpAddressClick(String ipAddress);
}
