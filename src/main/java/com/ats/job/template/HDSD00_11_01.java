package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 住院病案首页子集
 */
public class HDSD00_11_01 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_11_01(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        " CDA Header\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.52\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0032\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>住院病案首页</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "\n" +
                        "  <!--文档记录对象（患者）-->\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "\n" +
                        "      <!-- 健康卡号 -->\n" +
                        "      <id root=\"2.16.156.10011.1.19\" extension=\"" + cdaData.getCustomCol("DE01_00_021_00") + "\"/>\n" +
                        "\n" +
                        "      <!-- 住院号标识 -->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "\n" +
                        "      <!-- 病理号标识 -->\n" +
                        "      <id root=\"2.16.156.10011.1.8\" extension=\"" + cdaData.getCustomCol("DE01_00_005_00") + "\"></id>\n" +
                        "\n" +
                        "      <!-- 病案号标识 -->\n" +
                        "      <id root=\"2.16.156.10011.1.13\" extension=\"D2011000001\"/>\n" +
                        "\n" +
                        "      <!-- 现住址 -->\n" +
                        "      <addr use=\"H\">\n" +
                        "        <houseNumber>" + cdaData.getCustomCol("DE02_01_009_06") + "</houseNumber>\n" +
                        "        <streetName>" + cdaData.getCustomCol("DE02_01_009_05") + "</streetName>\n" +
                        "        <township>" + cdaData.getCustomCol("DE02_01_009_04") + "</township>\n" +
                        "        <county>" + cdaData.getCustomCol("DE02_01_009_03") + "</county>\n" +
                        "        <city>" + cdaData.getCustomCol("DE02_01_009_02") + "</city>\n" +
                        "        <state>" + cdaData.getCustomCol("DE02_01_009_01") + "</state>\n" +
                        "        <postalCode>" + cdaData.getCustomCol("DE02_01_047_00") + "</postalCode>\n" +
                        "      </addr>\n" +
                        "\n" +
                        "      <telecom value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "\n" +
                        "        <!--患者身份证号-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "        <birthTime value=\"" + cdaData.getCustomCol("DE02_01_005_01") + "\"/>\n" +
                        "        <maritalStatusCode code=\"" + cdaData.getCustomCol("DE02_01_018_00") + "\" displayName=\"未婚\" codeSystem=\"2.16.156.10011.2.3.3.5\" codeSystemName=\"婚姻状况代码表（GB/T 2261.2）\"/>\n" +
                        "        <ethnicGroupCode code=\"" + cdaData.getCustomCol("DE02_01_025_00") + "\" displayName=\"汉族\" codeSystem=\"2.16.156.10011.2.3.3.3\" codeSystemName=\"民族类别代码表（GB 3304）\"/>\n" +
                        "        <!-- 出生地 -->\n" +
                        "                <birthplace>\n" +
                        "          <place classCode=\"PLC\" determinerCode=\"INSTANCE\">\n" +
                        "            <addr>\n" +
                        "              <county>" + cdaData.getCustomCol("DE02_01_009_03") + "</county>\n" +
                        "              <city>" + cdaData.getCustomCol("DE02_01_009_02") + "</city>\n" +
                        "              <state>" + cdaData.getCustomCol("DE02_01_009_01") + "</state>\n" +
                        "              <postalCode>" + cdaData.getCustomCol("DE02_01_047_00") + "</postalCode>\n" +
                        "            </addr>\n" +
                        "          </place>\n" +
                        "        </birthplace>\n" +
                        "\n" +
                        "        <!-- 国籍 -->\n" +
                        "        <nationality code=\"" + cdaData.getCustomCol("DE02_01_015_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.1\" codeSystemName=\"世界各国和地区名称代码(GB/T 2659)\"  displayName=\"中国\"/>\n" +
                        "\n" +
                        "        <!-- 年龄 -->\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"></age>\n" +
                        "\n" +
                        "        <!-- 工作单位 -->\n" +
                        "        <employerOrganization>\n" +
                        "          <name>" + cdaData.getCustomCol("DE02_01_004_00") + "</name>\n" +
                        "          <telecom value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"></telecom>\n" +
                        "          <!-- 工作地址 -->\n" +
                        "      <addr use=\"WP\">\n" +
                        "        <houseNumber>" + cdaData.getCustomCol("DE02_01_009_06") + "</houseNumber>\n" +
                        "        <streetName>" + cdaData.getCustomCol("DE02_01_009_05") + "</streetName>\n" +
                        "        <township>" + cdaData.getCustomCol("DE02_01_009_04") + "</township>\n" +
                        "        <county>" + cdaData.getCustomCol("DE02_01_009_03") + "</county>\n" +
                        "        <city>" + cdaData.getCustomCol("DE02_01_009_02") + "</city>\n" +
                        "        <state>" + cdaData.getCustomCol("DE02_01_009_01") + "</state>\n" +
                        "        <postalCode>" + cdaData.getCustomCol("DE02_01_047_00") + "</postalCode>\n" +
                        "      </addr>\n" +
                        "        </employerOrganization>\n" +
                        "\n" +
                        "        <!-- 户口信息 -->\n" +
                        "        <household>\n" +
                        "          <place classCode=\"PLC\" determinerCode=\"INSTANCE\">\n" +
                        "      <addr>\n" +
                        "        <houseNumber>" + cdaData.getCustomCol("DE02_01_009_06") + "</houseNumber>\n" +
                        "        <streetName>" + cdaData.getCustomCol("DE02_01_009_05") + "</streetName>\n" +
                        "        <township>" + cdaData.getCustomCol("DE02_01_009_04") + "</township>\n" +
                        "        <county>" + cdaData.getCustomCol("DE02_01_009_03") + "</county>\n" +
                        "        <city>" + cdaData.getCustomCol("DE02_01_009_02") + "</city>\n" +
                        "        <state>" + cdaData.getCustomCol("DE02_01_009_01") + "</state>\n" +
                        "        <postalCode>" + cdaData.getCustomCol("DE02_01_047_00") + "</postalCode>\n" +
                        "      </addr>\n" +
                        "          </place>\n" +
                        "        </household>\n" +
                        "\n" +
                        "        <!-- 籍贯信息 -->\n" +
                        "        <nativePlace>\n" +
                        "          <place classCode=\"PLC\" determinerCode=\"INSTANCE\">\n" +
                        "            <addr>\n" +
                        "              <city>" + cdaData.getCustomCol("DE02_01_009_02") + "</city>\n" +
                        "              <state>" + cdaData.getCustomCol("DE02_01_009_01") + "</state>\n" +
                        "            </addr>\n" +
                        "          </place>\n" +
                        "        </nativePlace>\n" +
                        "\n" +
                        "        <!--职业状况-->\n" +
                        "        <occupation>\n" +
                        "          <occupationCode code=\"" + cdaData.getCustomCol("DE02_01_052_02") + "\" codeSystem=\"2.16.156.10011.2.3.3.13\" codeSystemName=\"从业状况（个人身体）代码表（GB/T 2261.4）\" displayName=\"职员\"/>\n" +
                        "        </occupation>\n" +
                        "      </patient>\n" +
                        "\n" +
                        "            <!--提供患者服务机构-->\n" +
                        "      <providerOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <!--机构标识号-->\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"" + cdaData.getCustomCol("DE08_10_052_00") + "\"/>\n" +
                        "        <!--住院机构名称-->\n" +
                        "        <name>" + cdaData.getCustomCol("DE08_10_013_00") + "</name>\n" +
                        "      </providerOrganization>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "\n" +
                        "  <!-- 文档创作者 -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <time/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "\n" +
                        "  <!-- 保管机构 -->\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "      <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "        </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "\n" +
                        "  <!-- 科主任签名 -->\n" +
                        "  <legalAuthenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"科主任\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </legalAuthenticator>\n" +
                        "\n" +
                        "  <!-- 主(副主)任医师签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"主任(副主任)医师\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!-- 主治医师签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"主治医师\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!-- 住院医师签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"住院医师\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!-- 责任护士签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"责任护士\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!-- 进修医师签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"进修医师\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!-- 实习医师签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"实习医师\"/>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!-- 编码员签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"编码员\"/>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!--其他参与者（联系人）@typeCode: NOT(ugent notification contact)，固定值，表示不同的参与者\n" +
                        "-->\n" +
                        "  <participant typeCode=\"NOT\">\n" +
                        "    <!--联系人@classCode：CON，固定值，表示角色是联系人 -->\n" +
                        "    <associatedEntity classCode=\"ECON\">\n" +
                        "      <!--联系人类别，表示与患者之间的关系-->\n" +
                        "      <code code=\"" + cdaData.getCustomCol("DE02_10_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.8\" codeSystemName=\"家庭关系代码表\"/>\n" +
                        "            <!--联系人地址-->\n" +
                        "      <addr use=\"H\">\n" +
                        "        <houseNumber>" + cdaData.getCustomCol("DE02_01_009_06") + "</houseNumber>\n" +
                        "        <streetName>" + cdaData.getCustomCol("DE02_01_009_05") + "</streetName>\n" +
                        "        <township>" + cdaData.getCustomCol("DE02_01_009_04") + "</township>\n" +
                        "        <county>" + cdaData.getCustomCol("DE02_01_009_03") + "</county>\n" +
                        "        <city>" + cdaData.getCustomCol("DE02_01_009_02") + "</city>\n" +
                        "        <state>" + cdaData.getCustomCol("DE02_01_009_01") + "</state>\n" +
                        "        <postalCode>" + cdaData.getCustomCol("DE02_01_047_00") + "</postalCode>\n" +
                        "      </addr>\n" +
                        "      <!--电话号码-->\n" +
                        "      <telecom use=\"H\" value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                        "      <!--联系人-->\n" +
                        "      <associatedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <!--姓名-->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </associatedPerson>\n" +
                        "    </associatedEntity>\n" +
                        "  </participant>\n" +
                        "\n" +
                        "  <!--相关文档-->\n" +
                        "  <relatedDocument typeCode=\"RPLC\">\n" +
                        "    <parentDocument>\n" +
                        "      <id/>\n" +
                        "      <setId/>\n" +
                        "      <versionNumber/>\n" +
                        "    </parentDocument>\n" +
                        "  </relatedDocument>\n" +
                        "\n" +
                        "  <!--文档中医疗卫生事件的就诊场景,即入院场景记录-->\n" +
                        "  <componentOf typeCode=\"COMP\">\n" +
                        "    <!--就诊-->\n" +
                        "    <encompassingEncounter classCode=\"ENC\" moodCode=\"EVN\">\n" +
                        "      <!--入院途径 -->\n" +
                        "      <code code=\"" + cdaData.getCustomCol("DE06_00_237_00") + "\" displayName=\"急诊\" codeSystem=\"2.16.156.10011.2.3.1.270\" codeSystemName=\"入院途径代码表\"/>\n" +
                        "      <!--就诊时间-->\n" +
                        "      <effectiveTime>\n" +
                        "        <!--入院日期-->\n" +
                        "        <low value=\"" + cdaData.getCustomCol("DE06_00_092_00") + "\"/>\n" +
                        "        <!--出院日期-->\n" +
                        "        <high value=\"" + cdaData.getCustomCol("DE06_00_017_00") + "\"/>\n" +
                        "      </effectiveTime>\n" +
                        "      <location typeCode=\"LOC\">\n" +
                        "        <healthCareFacility classCode=\"SDLOC\">\n" +
                        "          <!--机构角色-->\n" +
                        "          <serviceProviderOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "            <!--入院病房-->\n" +
                        "            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                <id root=\"2.16.156.10011.1.21\" extension=\"001\"/>\n" +
                        "                <name>" + cdaData.getCustomCol("DE01_00_019_00") + "</name>\n" +
                        "                <!--入院科室-->\n" +
                        "                <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                  <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                    <id root=\"2.16.156.10011.1.26\" extension=\"001\"/>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                  </wholeOrganization>\n" +
                        "                </asOrganizationPartOf>\n" +
                        "              </wholeOrganization>\n" +
                        "            </asOrganizationPartOf>\n" +
                        "          </serviceProviderOrganization>\n" +
                        "        </healthCareFacility>\n" +
                        "      </location>\n" +
                        "    </encompassingEncounter>\n" +
                        "  </componentOf>\n" +
                        "\n" +
                        "<!--***************************************************\n" +
                        "文档体Body\n" +
                        "*******************************************************\n" +
                        "-->\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "生命体征章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8716-3\" displayName=\"VITAL SIGNS\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" />\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.019.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院体重\"><qualifier><name displayName=\"新生儿入院体重\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_188_00") + "\" unit=\"g\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.019.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出生体重\"><qualifier><name displayName=\"新生儿出生体重\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_019_00") + "\" unit=\"g\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "诊断章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"29548-5\" displayName=\"Diagnosis\"  codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "\n" +
                        "          <!--门（急）诊诊断-疾病名称-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.025.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"门（急）诊诊断名称\"><qualifier><name displayName=\"门（急）诊诊断\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_01_025_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--门（急）诊诊断-疾病编码-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.024.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"门（急）诊诊断疾病编码\"><qualifier><name displayName=\"门（急）诊诊断\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.5\" codeSystemName=\"疾病代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--病理诊断-疾病名称-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.025.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"病理诊断-疾病名称\"><qualifier><name displayName=\"病理诊断\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_01_025_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--病理诊断-疾病编码-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.024.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"病理诊断-疾病编码\"><qualifier><name displayName=\"病理诊断\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.5\" codeSystemName=\"疾病代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "主要健康问题章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11450-4\" displayName=\"PROBLEM LIST\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.119.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"住院者疾病状态代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_119_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.100\" codeSystemName=\"住院者疾病状态代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--住院患者损伤和中毒外部原因-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.152.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"损伤中毒的外部原因\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_152_00") + "</value>\n" +
                        "              <entryRelationship typeCode=\"REFR\" negationInd=\"false\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.01.078.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"损伤中毒的外部原因-疾病编码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_078_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.5\" codeSystemName=\"疾病代码表（ICD-10）\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--颅脑损伤患者入院前昏迷时间-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <code displayName=\"颅脑损伤患者入院前昏迷时间\"/>\n" +
                        "              <statusCode/>\n" +
                        "              <component>\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.10.138.01\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"颅脑损伤患者入院前昏迷时间-d\"/>\n" +
                        "                  <value xsi:type=\"PQ\" unit=\"d\" value=\"" + cdaData.getCustomCol("DE05_10_138_01") + "\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.10.138.02\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"颅脑损伤患者入院前昏迷时间-h\"/>\n" +
                        "                  <value xsi:type=\"PQ\" unit=\"h\" value=\"" + cdaData.getCustomCol("DE05_10_138_02") + "\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.10.138.03\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"颅脑损伤患者入院前昏迷时间-min\"/>\n" +
                        "                  <value xsi:type=\"PQ\" unit=\"min\" value=\"" + cdaData.getCustomCol("DE05_10_138_03") + "\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--颅脑损伤患者入院后昏迷时间-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <code displayName=\"颅脑损伤患者入院后昏迷时间\"/>\n" +
                        "              <statusCode/>\n" +
                        "              <component>\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.10.138.01\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"颅脑损伤患者入院后昏迷时间-d\"/>\n" +
                        "                  <value xsi:type=\"PQ\" unit=\"d\" value=\"" + cdaData.getCustomCol("DE05_10_138_01") + "\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.10.138.02\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"颅脑损伤患者入院后昏迷时间-h\"/>\n" +
                        "                  <value xsi:type=\"PQ\" unit=\"h\" value=\"" + cdaData.getCustomCol("DE05_10_138_02") + "\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.10.138.03\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"颅脑损伤患者入院后昏迷时间-min\"/>\n" +
                        "                  <value xsi:type=\"PQ\" unit=\"min\" value=\"" + cdaData.getCustomCol("DE05_10_138_03") + "\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "转科记录章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "          <section>\n" +
                        "           <code code=\"42349-1\" displayName=\"REASON FOR REFERRAL\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "            <text/>\n" +
                        "            <!--转科条目-->\n" +
                        "            <entry>\n" +
                        "              <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                <code/>\n" +
                        "                  <!--转科原因（数据元）-->\n" +
                        "                <author>\n" +
                        "                <time/>\n" +
                        "                <assignedAuthor>\n" +
                        "                  <id/>\n" +
                        "                  <representedOrganization>\n" +
                        "                    <!--住院患者转科科室名称-->\n" +
                        "                    <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                  </representedOrganization>\n" +
                        "                </assignedAuthor>\n" +
                        "              </author>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "出院诊断章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11535-2\" displayName=\"HOSPITAL DISCHARGE DX\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--出院诊断-主要诊断条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.025.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院诊断-主要诊断名称\"><qualifier><name displayName=\"主要诊断名称\"></name></qualifier></code>\n" +
                        "              <!--确诊日期-->\n" +
                        "              <effectiveTime value=\"20070531\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_01_025_00") + "</value>\n" +
                        "\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--住院患者疾病诊断类型-代码/住院患者疾病诊断类型-详细描述-->\n" +
                        "              <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院诊断-主要诊断疾病编码\"><qualifier><name displayName=\"主要诊断疾病编码\"></name></qualifier></code>\n" +
                        "              <!--疾病诊断代码/疾病诊断名称-->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--入院病情 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE09.00.104.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院诊断-主要诊断入院病情代码\"><qualifier><name displayName=\"主要诊断入院病情代码\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE09_00_104_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.253\" codeSystemName=\"入院病情代码表\"></value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--出院诊断-其他诊断条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.025.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院诊断-其他诊断名称\"><qualifier><name displayName=\"其他诊断名称\"></name></qualifier></code>\n" +
                        "              <!--确诊日期-->\n" +
                        "              <effectiveTime value=\"20070531\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_01_025_00") + "</value>\n" +
                        "\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--住院患者疾病诊断类型-代码/住院患者疾病诊断类型-详细描述-->\n" +
                        "              <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院诊断-其他诊断疾病编码\"><qualifier><name displayName=\"其他诊断疾病编码\"></name></qualifier></code>\n" +
                        "              <!--疾病诊断代码/疾病诊断名称-->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--入院病情 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE09.00.104.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院诊断-其他诊断入院病情代码\"><qualifier><name displayName=\"其他诊断入院病情代码\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE09_00_104_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.253\" codeSystemName=\"入院病情代码表\"></value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--离院方式-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.223.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"离院方式\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_223_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.265\" codeSystemName=\"离院方式代码表\"/>\n" +
                        "              <entryRelationship typeCode=\"COMP\" negationInd=\"false\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE08.10.013.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"拟接受医疗机构名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_10_013_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "过敏史章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "            <component>\n" +
                        "        <section>\n" +
                        "                   <code code=\"48765-2\" displayName=\"Allergies, adverse reactions, alerts\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "           <text/>\n" +
                        "           <entry typeCode=\"DRIV\">\n" +
                        "               <act classCode=\"ACT\" moodCode=\"EVN\">\n" +
                        "                     <code nullFlavor=\"NA\"/>\n" +
                        "                     <entryRelationship typeCode=\"SUBJ\">\n" +
                        "                   <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                     <code code=\"DE02.10.023.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                     <value xsi:type=\"BL\" value=\"true\"></value>\n" +
                        "                     <participant typeCode=\"CSM\">\n" +
                        "                                       <participantRole classCode=\"MANU\">\n" +
                        "                                           <playingEntity classCode=\"MMAT\">\n" +
                        "                                              <!--住院患者过敏源-->\n" +
                        "                                              <code code=\"DE02.10.022.00\"   codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"过敏药物\"/>\n" +
                        "                                              <desc xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_022_00") + "</desc>\n" +
                        "                                           </playingEntity>\n" +
                        "                                       </participantRole>\n" +
                        "                                   </participant>\n" +
                        "                    </observation>\n" +
                        "               </entryRelationship>\n" +
                        "            </act>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "实验室检查章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"30954-2\" displayName=\"STUDIES SUMMARY\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "<!-- 血型-->\n" +
                        "            <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
                        "              <statusCode/>\n" +
                        "              <component typeCode=\"COMP\">\n" +
                        "<!-- ABO血型 -->\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.001.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"  />\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_50_001_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.85\" codeSystemName=\"ABO血型代码表\" displayName=\"A型\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component typeCode=\"COMP\">\n" +
                        "<!-- Rh血型 -->\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.010.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" />\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_50_010_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.250\" codeSystemName=\"Rh血型代码表\" displayName=\"阴性\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "手术操作章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"47519-4\" displayName=\"HISTORY OF PROCEDURES\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <!-- 1..1 手术记录 -->\n" +
                        "            <procedure classCode=\"PROC\" moodCode=\"EVN\">\n" +
                        "              <code code=\"" + cdaData.getCustomCol("DE06_00_093_01") + "\" codeSystem=\"2.16.156.10011.2.3.3.12\" codeSystemName=\"手术(操作)代码表（ICD-9-CM）\"/>\n" +
                        "              <statusCode/>\n" +
                        "              <!--操作日期/时间-->\n" +
                        "              <effectiveTime value=\"" + cdaData.getCustomCol("DE06_00_095_00") + "\"/>\n" +
                        "\n" +
                        "              <!--手术者-->\n" +
                        "              <performer>\n" +
                        "                <assignedEntity>\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <assignedPerson>\n" +
                        "                     <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                   </assignedPerson>\n" +
                        "                </assignedEntity>\n" +
                        "              </performer>\n" +
                        "              <!--第一助手-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <participantRole classCode=\"ASSIGNED\" >\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                    <code displayName=\"第一助手\"/>\n" +
                        "                    <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                   </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "                            <!--第二助手-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <participantRole classCode=\"ASSIGNED\" >\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                    <code displayName=\"第二助手\"/>\n" +
                        "                    <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                       <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.094.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术（操作）名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_094_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!--手术级别 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.255.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术级别\"/>\n" +
                        "                  <!--手术级别 -->\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_255_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.258\" codeSystemName=\"手术级别代码表\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!--手术切口类别 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.257.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术切口类别代码\"/>\n" +
                        "                  <!--手术级别 -->\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_257_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.256\" codeSystemName=\"手术切口类别代码表\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!--手术切口愈合等级-->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.10.147.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术切口愈合等级\"/>\n" +
                        "                  <!--手术切口愈合等级-->\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_147_00") + "\" displayName=\"切口等级Ⅰ/愈合类型甲\" codeSystem=\"2.16.156.10011.2.3.1.257\" codeSystemName=\"手术切口愈合等级代码表\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "\n" +
                        "              <!-- 0..1 麻醉信息 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.073.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"麻醉方式代码\"/>\n" +
                        "                  <value code=\"" + cdaData.getCustomCol("DE06_00_073_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.159\" codeSystemName=\"麻醉方式代码表\" xsi:type=\"CD\"></value>\n" +
                        "                  <performer>\n" +
                        "                    <assignedEntity>\n" +
                        "                      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                      <assignedPerson>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                      </assignedPerson>\n" +
                        "                    </assignedEntity>\n" +
                        "                  </performer>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </procedure>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "<!--\n" +
                        "*******************************************************\n" +
                        "住院史章节\n" +
                        "*******************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11336-5\" codeSystem=\"2.16.840.1.113883.6.1\" displayName=\"HISTORY OF HOSPITALIZATIONS\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--住院次数  　-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.090.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"住院次数\"/>\n" +
                        "              <value xsi:type=\"INT\" value=\"" + cdaData.getCustomCol("DE02_10_090_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "    <!--\n" +
                        "*******************************************************\n" +
                        " 住院过程章节\n" +
                        "*******************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8648-8\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Hospital Course\"/>\n" +
                        "          <text/>\n" +
                        "          <!--实际住院天数　-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.310.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"实际住院天数\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE06_00_310_00") + "\" unit=\"天\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <!--出院科室及病房 -->\n" +
                        "            <act classCode=\"ACT\" moodCode=\"EVN\">\n" +
                        "              <code/>\n" +
                        "              <author>\n" +
                        "                <time/>\n" +
                        "                <assignedAuthor>\n" +
                        "                  <id/>\n" +
                        "                  <representedOrganization>\n" +
                        "                    <!--住院患者出院病房、科室名称-->\n" +
                        "                    <id root=\"2.16.156.10011.1.21\" extension=\"003\"/>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE01_00_019_00") + "</name>\n" +
                        "                    <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                      <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                        <id root=\"2.16.156.10011.1.26\" extension=\"567\"/>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                      </wholeOrganization>\n" +
                        "                    </asOrganizationPartOf>\n" +
                        "                  </representedOrganization>\n" +
                        "                </assignedAuthor>\n" +
                        "              </author>\n" +
                        "            </act>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "行政管理章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "           <code displayName=\"行政管理\"/>\n" +
                        "          <text/>\n" +
                        "          <!--亡患者尸检标志-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE09.00.108.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡患者尸检标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE09_00_108_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--病案质量-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE09.00.103.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"病案质量\"/>\n" +
                        "              <!-- 质控日期 -->\n" +
                        "              <effectiveTime value=\"" + cdaData.getCustomCol("DE09_00_120_00") + "\"></effectiveTime>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE09_00_103_00") + "\" codeSystem=\"2.16.156.10011.2.3.2.29\" codeSystemName=\"病案质量等级表\"/>\n" +
                        "              <author >\n" +
                        "                <time/>\n" +
                        "                <assignedAuthor>\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <code displayName=\"质控医生\"/>\n" +
                        "                  <assignedPerson>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </assignedPerson>\n" +
                        "                </assignedAuthor>\n" +
                        "              </author>\n" +
                        "              <author >\n" +
                        "                <time/>\n" +
                        "                <assignedAuthor>\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <code displayName=\"质控护士\"/>\n" +
                        "                  <assignedPerson>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </assignedPerson>\n" +
                        "                </assignedAuthor>\n" +
                        "              </author>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "<!--\n" +
                        "***********************************************\n" +
                        "治疗计划章节\n" +
                        "***********************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"18776-5\" displayName=\"TREATMENT PLAN\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!-- 有否出院31天内再住院计划 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.194.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院31天内再住院标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE06_00_194_00") + "\"/>\n" +
                        "              <entryRelationship typeCode=\"GEVL\" negationInd=\"false\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.195.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院31天内再住院目的\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_195_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "费用章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "                <section>\n" +
                        "                    <code code=\"48768-6\" displayName=\"PAYMENT SOURCES\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "                    <text/>\n" +
                        "\n" +
                        "          <!--医疗付费方式 -->\n" +
                        "                    <entry>\n" +
                        "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                            <code code=\"DE07.00.007.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"医疗付费方式代码\" ></code>\n" +
                        "                            <value xsi:type=\"CD\" codeSystem=\"2.16.156.10011.2.3.1.269\" displayName=\"城镇职工基本医疗保险\" codeSystemName=\"医疗付费方式代码表\">" + cdaData.getCustomCol("DE07_00_007_00") + "</value>\n" +
                        "                        </observation>\n" +
                        "                    </entry>\n" +
                        "\n" +
                        "          <!--住院总费用 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"HDSD00.11.142\" codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"住院总费用\"/>\n" +
                        "              <value xsi:type=\"MO\" value=\"8000\" currency=\"元\"/>\n" +
                        "              <entryRelationship typeCode=\"COMP\" negationInd=\"false\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.143\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"住院总费用-自付金额（元）\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"25000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--综合医疗服务费 -->\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <statusCode></statusCode>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.147\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"综合医疗服务费-一般医疗服务费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"5000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.148\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"综合医疗服务费-一般治疗操作费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.145\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"综合医疗服务费-护理费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.146\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"综合医疗服务费-其他费用\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"1000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--诊断类服务费 -->\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <statusCode></statusCode>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.121\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"诊断-病理诊断费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.123\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"诊断-实验室诊断费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.124\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"诊断-影像学诊断费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.122\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"诊断-临床诊断项目费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--治疗类服务费 -->\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <statusCode></statusCode>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.129\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"治疗-非手术治疗项目费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"5000\" currency=\"元\"/>\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"HDSD00.11.130\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"治疗-非手术治疗项目费-临床物理治疗费\"/>\n" +
                        "                      <value xsi:type=\"MO\" value=\"3000\" currency=\"元\"/>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.131\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"治疗-手术治疗费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"5000\" currency=\"元\"/>\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"HDSD00.11.132\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"治疗-手术治疗费-麻醉费\"/>\n" +
                        "                      <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"HDSD00.11.133\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"治疗-手术治疗费-手术费\"/>\n" +
                        "                      <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--康复费类服务费 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"HDSD00.11.055\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"康复费\"/>\n" +
                        "              <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--中医治疗费 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"HDSD00.11.136\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"中医治疗费\"/>\n" +
                        "              <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--西药费 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"HDSD00.11.098\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"西药费\"/>\n" +
                        "              <value xsi:type=\"MO\" value=\"5000\" currency=\"元\"/>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.099\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"西药费-抗菌药物费用\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--中药费 -->\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <statusCode></statusCode>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.135\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"中药费-中成药费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"5000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.134\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"中药费-中草药费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"1000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!-- 血液和血液制品类服务费 -->\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <statusCode></statusCode>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.115\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"血费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"5000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.111\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"白蛋白类制品费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"3000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.113\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"球蛋白类制品费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <!-- 凝血因子类制品费 -->\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.112\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"凝血因子类制品费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"1000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <!--细胞因子类制品费 -->\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.114\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"细胞因子类制品费\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"1000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!-- 耗材类费用 -->\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <statusCode></statusCode>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.038\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"一次性医用材料费-检查用\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.040\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"一次性医用材料费-治疗用\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"HDSD00.11.039\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"一次性医用材料费-手术用\"/>\n" +
                        "                  <value xsi:type=\"MO\" value=\"2000\" currency=\"元\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--其他费 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"HSDB05.10.130\"  codeSystem=\"2.16.156.10011.2.2.4\" codeSystemName=\"住院病案首页基本数据集\" displayName=\"其他费\"/>\n" +
                        "              <value xsi:type=\"MO\" value=\"4000\" currency=\"元\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
