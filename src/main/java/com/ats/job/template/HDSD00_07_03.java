package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 阴道分娩记录子集
 */
public class HDSD00_07_03 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_07_03(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.35\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0015\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <!--title-->\n" +
                        "  <title>阴道分娩记录</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "\n" +
                        "      <!--住院号 -->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "\n" +
                        "        <!--患者身份证号标识-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"/>\n" +
                        "\n" +
                        "      </patient>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <time value=\"20110404\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code  displayName=\"接生者\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"助产者\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code  displayName=\"助手\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code  displayName=\"护婴者\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code  displayName=\"指导者\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code  displayName=\"记录人\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <participant typeCode=\"NOT\">\n" +
                        "    <!--联系人@classCode：CON，固定值，表示角色是联系人 -->\n" +
                        "    <associatedEntity classCode=\"ECON\">\n" +
                        "      <!--联系人电话-->\n" +
                        "      <telecom value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                        "      <!--联系人-->\n" +
                        "      <associatedPerson>\n" +
                        "        <!--姓名-->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </associatedPerson>\n" +
                        "    </associatedEntity>\n" +
                        "  </participant>\n" +
                        "\n" +
                        "  <relatedDocument typeCode=\"RPLC\">\n" +
                        "    <parentDocument>\n" +
                        "      <id/>\n" +
                        "      <setId/>\n" +
                        "      <versionNumber/>\n" +
                        "    </parentDocument>\n" +
                        "  </relatedDocument>\n" +
                        "\n" +
                        "  <!-- 病床号、病房、病区、科室和医院的关联 -->\n" +
                        "  <componentOf>\n" +
                        "    <encompassingEncounter>\n" +
                        "      <!-- 入院日期时间 -->\n" +
                        "      <effectiveTime/>\n" +
                        "      <location>\n" +
                        "        <healthCareFacility>\n" +
                        "          <serviceProviderOrganization>\n" +
                        "            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "              <!-- DE01.00.026.00  病床号 -->\n" +
                        "              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                <id root=\"2.16.156.10011.1.22\" extension=\"" + cdaData.getCustomCol("DE01_00_026_00") + "\"/>\n" +
                        "                <name>" + cdaData.getCustomCol("DE01_00_026_00") + "</name>\n" +
                        "                <!-- DE01.00.019.00  病房号 -->\n" +
                        "                <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                  <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                    <id root=\"2.16.156.10011.1.21\" extension=\"" + cdaData.getCustomCol("DE01_00_019_00") + "\"/>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE01_00_019_00") + "</name>\n" +
                        "                    <!-- DE08.10.026.00  科室名称 -->\n" +
                        "                    <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                      <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                        <id root=\"2.16.156.10011.1.26\" extension=\"" + cdaData.getCustomCol("DE08_10_026_00") + "\"/>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                        <!-- DE08.10.054.00  病区名称 -->\n" +
                        "                        <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                          <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                            <id root=\"2.16.156.10011.1.27\" extension=\"" + cdaData.getCustomCol("DE08_10_054_00") + "\"/>\n" +
                        "                            <name>" + cdaData.getCustomCol("DE08_10_054_00") + "</name>\n" +
                        "                            <!--XXX医院 -->\n" +
                        "                            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                                <id root=\"2.16.156.10011.1.5\" extension=\"" + cdaData.getCustomCol("DE08_10_052_00") + "\"/>\n" +
                        "                                <name>" + cdaData.getCustomCol("DE08_10_052_00") + "</name>\n" +
                        "                              </wholeOrganization>\n" +
                        "                            </asOrganizationPartOf>\n" +
                        "                          </wholeOrganization>\n" +
                        "                        </asOrganizationPartOf>\n" +
                        "                      </wholeOrganization>\n" +
                        "                    </asOrganizationPartOf>\n" +
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
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "      <!-- 既往史章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11348-0\" displayName=\"HISTORY OF PAST ILLNESS\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.01.108.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"孕次\"/>\n" +
                        "              <value xsi:type=\"INT\" value=\"" + cdaData.getCustomCol("DE04_01_108_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.002.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产次\"/>\n" +
                        "              <value xsi:type=\"INT\" value=\"" + cdaData.getCustomCol("DE02_10_002_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!-- 阴道分娩章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"57074-7\" displayName=\"labor and delivery process\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.098.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"预产期\"/>\n" +
                        "              <value xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE05_10_098_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.224.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"临产日期时间\"/>\n" +
                        "              <value xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE06_00_224_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.154.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"胎膜破裂日期时间\"/>\n" +
                        "              <value xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE05_10_154_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.058.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"前羊水性状\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_058_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.057.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"前羊水量（mL）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_30_057_00") + "\" unit=\"ml\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.250.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"宫缩开始日期时间\"/>\n" +
                        "              <value xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE04_10_250_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.021.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"第1产程时长（min）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE06_00_021_00") + "\" unit=\"min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.250.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"宫口开全日期时间\"/>\n" +
                        "              <value xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE04_10_250_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.019.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"第2产程时长（min）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE06_00_019_00") + "\" unit=\"min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.01.014.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"胎儿娩出日期时间\"/>\n" +
                        "              <value xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE02_01_014_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.020.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"第3产程时长（min）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE06_00_020_00") + "\" unit=\"min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.273.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"胎盘娩出日期时间\"/>\n" +
                        "              <value xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE06_00_273_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.236.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"总产程时长（min）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_236_00") + "\" unit=\"min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.044.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"胎方位代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_044_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.106\" codeSystemName=\"胎方位代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.311.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"胎儿娩出助产标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE06_00_311_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.312.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"助产方式\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_312_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.157.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"胎盘娩出情况\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_157_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.156.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"胎膜完整情况标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE05_10_156_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.063.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"羊水性状\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_063_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.061.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"羊水量（mL）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_30_061_00") + "\" unit=\"ml\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.055.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"脐带长度（cm）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_30_055_00") + "\" unit=\"cm\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.059.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"绕颈身（周）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_30_059_00") + "\" unit=\"周\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.145.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"脐带异常情况标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE05_10_145_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE08.50.022.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产时用药\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_022_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.295.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"预防措施\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_295_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.165.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产妇会阴切开标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE05_10_165_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.252.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"会阴切开位置\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_252_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.011.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产妇会阴缝合针数\"/>\n" +
                        "              <value xsi:type=\"INT\" value=\"" + cdaData.getCustomCol("DE06_00_011_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.003.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产妇会阴裂伤程度代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_003_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.109\" codeSystemName=\"产妇会阴裂伤程度代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.253.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"会阴血肿标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE04_10_253_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.254.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"会阴血肿大小\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_254_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.213.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"会阴血肿处理\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_213_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.073.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"麻醉方法代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_073_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.159\" codeSystemName=\"麻醉方法代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE08.50.022.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"麻醉药物名称\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_022_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.163.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"阴道裂伤标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE05_10_163_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.164.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"阴道血肿标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE05_10_164_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.249.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"宫颈裂伤标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE04_10_249_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.200.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"宫颈缝合情况\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_200_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE08.50.022.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产后用药\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_022_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.182.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"分娩过程摘要\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_182_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.245.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"宫缩情况\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_245_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.233.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"子宫情况\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_233_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.025.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"恶露状况\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_025_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.137.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"会阴情况\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_137_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.284.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"修补手术过程\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_284_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.50.138.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"存脐带血情况标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE04_50_138_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!-- 产后处置章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"57076-2\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"postpartum hospitalization treatment\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.007.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产后诊断\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_007_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.218.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产后观察日期时间\"/>\n" +
                        "              <value xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE06_00_218_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.246.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产后检查时间（min）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_246_00") + "\" unit=\"min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
                        "              <statusCode/>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.10.174.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"收缩压\"/>\n" +
                        "                  <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_174_00") + "\" unit=\"mmHg\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.10.176.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"舒张压\"/>\n" +
                        "                  <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_176_00") + "\" unit=\"mmHg\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.118.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产后脉搏（次/min ）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_118_00") + "\" unit=\"次/min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.206.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产后心率（次/min ）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_206_00") + "\" unit=\"/次min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.012.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产后出血量（mL）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_012_00") + "\" unit=\"ml\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.245.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产后宫缩\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_245_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.067.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产后宫底高度（cm）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_067_00") + "\" unit=\"cm\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.240.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"肛查\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_240_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!-- 新生儿章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"57075-4\" displayName=\"newborn delivery information\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.01.040.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"新生儿性别代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE02_10_240_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"性别代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.019.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"新生儿出生体重（g）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_019_00") + "\" unit=\"g\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.018.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"新生儿出生身长（cm）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_018_00") + "\" unit=\"cm\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.168.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产瘤大小\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_168_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.167.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"产瘤部位\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_167_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!-- 分娩评估章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"51848-0\" displayName=\"Assessment note\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.215.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"Apgar评分间隔时间代码  \"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_215_00") + "\" codeSystem=\"2.16.156.10011.2.3.2.48\" codeSystemName=\"Apgar评分间隔时间代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.001.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"Apgar评分值\"/>\n" +
                        "              <value xsi:type=\"INT\" value=\"" + cdaData.getCustomCol("DE05_10_001_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.026.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"分娩结局代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_026_00") + "\" displayName=\"活产\" codeSystem=\"2.16.156.10011.2.3.2.49\" codeSystemName=\"分娩结局代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.160.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"新生儿异常情况代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_160_00") + "\" displayName=\"无\" codeSystem=\"2.16.156.10011.2.3.1.254\" codeSystemName=\"新生儿异常情况代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
