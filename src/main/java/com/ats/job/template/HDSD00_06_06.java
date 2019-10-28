package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 一般手术记录子集
 */
public class HDSD00_06_06 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_06_06(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <!--\n" +
                        "********************************************************\n" +
                        "Header\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.29\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0009\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>一般手术记录</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "  <!--文档记录对象（患者） [1..*] contextControlCode=\"OP\"表示本信息可以被重载-->\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "      <!--门诊号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.11\" extension=\"" + cdaData.getCustomCol("DE01_00_010_00") + "\"/>\n" +
                        "      <!--住院号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "      <!--电子申请单编号-->\n" +
                        "      <id root=\"2.16.156.10011.1.24\" extension=\"" + cdaData.getCustomCol("DE01_00_008_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "\n" +
                        "        <!--患者身份证号标识-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_030_00") + "\"/>\n" +
                        "\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" displayName=\""+ cdaData.getCustomCol("DE02_01_040_00_NAME") +"\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "        <!-- 年龄 -->\n" +
                        "        <age value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\" unit=\"岁\"/>\n" +
                        "      </patient>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "  <!-- 文档创作者 -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <time value=\"20110404\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>李医生</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "\n" +
                        "  <!-- 保管机构 -->\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "\n" +
                        "  <!--手术者签名-->\n" +
                        "  <authenticator>\n" +
                        "    <!--签名日期时间-->\n" +
                        "    <time value=\"201210111212\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"手术者\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
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
                        "  <!--\n" +
                        "*******************************************************\n" +
                        "文档体Body\n" +
                        "*******************************************************\n" +
                        "-->\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "      <!--既往史章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11348-0\" displayName=\"HISTORY OF PAST ILLNESS\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--手术史-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--手术史标志-->\n" +
                        "              <code code=\"DE02.10.062.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术史标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE02_10_062_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "术前诊断章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10219-4\" displayName=\"Surgical operation note preoperative Dx\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--术前诊断-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--术前诊断编码-->\n" +
                        "              <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术前诊断编码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" displayName=\""+ cdaData.getCustomCol("DE05_01_024_00_NAME") +"\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "手术章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"47519-4\" displayName=\"HISTORY OF PROCEDURES\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <!-- 1..1 手术记录 -->\n" +
                        "            <procedure classCode=\"PROC\" moodCode=\"EVN\">\n" +
                        "              <code code=\"" + cdaData.getCustomCol("DE06_00_093_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.12\" codeSystemName=\"手术(操作)代码表（ICD-9-CM）\"/>\n" +
                        "              <!--操作日期/时间-->\n" +
                        "              <effectiveTime>\n" +
                        "                <!--手术开始日期时间-->\n" +
                        "                <low value=\"" + cdaData.getCustomCol("DE06_00_221_00") + "\"/>\n" +
                        "                <!--手术结束日期时间-->\n" +
                        "                <high value=\"" + cdaData.getCustomCol("DE06_00_218_00") + "\"/>\n" +
                        "              </effectiveTime>\n" +
                        "              <!--手术者-->\n" +
                        "              <performer typeCode=\"PRF\">\n" +
                        "                <assignedEntity>\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "                  <assignedPerson>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </assignedPerson>\n" +
                        "                </assignedEntity>\n" +
                        "              </performer>\n" +
                        "              <!--第一助手-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "                  <code displayName=\"Ⅰ助\"/>\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "              <!--第二助手-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "                  <code displayName=\"Ⅱ助\"/>\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "              <!--器械护士姓名-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "                  <code displayName=\"器械护士\"/>\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "              <!--巡台护士姓名-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "                  <code displayName=\"巡台护士\"/>\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.094.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术（操作）名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_094_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!--手术间编号-->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.256.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"患者实施手术所在的手术室编号\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_256_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!--手术级别 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.255.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术级别\"/>\n" +
                        "                  <!--手术级别 -->\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_255_00") + "\" displayName=\""+ cdaData.getCustomCol("DE06_00_255_00_NAME") +"\" codeSystem=\"2.16.156.10011.2.3.1.258\" codeSystemName=\"手术级别代码表\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </procedure>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "失血章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"55103-6\" displayName=\"Surgical operation note estimated blood loss\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--出血量（mL）-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.097.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出血量（mL）\"/>\n" +
                        "              <value xsi:type=\"PQ\" unit=\"mL\" value=\"" + cdaData.getCustomCol("DE06_00_097_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "输血章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"56836-0\" displayName=\"History of blood transfusion\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--输血量（mL）-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--输血量（mL）-->\n" +
                        "              <code code=\"DE06.00.267.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"输血量（mL）\"/>\n" +
                        "              <value xsi:type=\"PQ\" unit=\"mL\" value=\"" + cdaData.getCustomCol("DE06_00_267_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--输血反应标志-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--输血反应标志-->\n" +
                        "              <code code=\"DE06.00.264.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"输血反应标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE06_00_264_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "麻醉章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10213-7\" displayName=\"Surgical operation note anesthesia\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <!-- 麻醉方式代码 -->\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.073.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"麻醉方式代码\"/>\n" +
                        "              <value code=\"" + cdaData.getCustomCol("DE06_00_073_00") + "\" displayName=\""+ cdaData.getCustomCol("DE06_00_073_00_NAME") +"\" codeSystem=\"2.16.156.10011.2.3.1.159\" codeSystemName=\"麻醉方式代码表\" xsi:type=\"CD\"/>\n" +
                        "              <!-- 麻醉医师姓名 -->\n" +
                        "              <performer>\n" +
                        "                <assignedEntity>\n" +
                        "                  <id/>\n" +
                        "                  <assignedPerson>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </assignedPerson>\n" +
                        "                </assignedEntity>\n" +
                        "              </performer>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "用药章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10160-0\" displayName=\"History of medication use\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--术前用药-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--术前用药-->\n" +
                        "              <code code=\"DE06.00.136.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术前用药\"><qualifier><name displayName=\"术前用药\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_136_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--术中用药-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--术中用药-->\n" +
                        "              <code code=\"DE06.00.136.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术中用药\"><qualifier><name displayName=\"术中用药\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_136_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "输液章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10216-0\" displayName=\"Surgical operation note fluids\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--输液量（mL）-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--输液量（mL）-->\n" +
                        "              <code code=\"DE06.00.268.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"输液量（mL）\"/>\n" +
                        "              <value xsi:type=\"PQ\" unit=\"mL\" value=\"" + cdaData.getCustomCol("DE06_00_268_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "术后诊断章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10218-6\" displayName=\"Surgical operation note postoperative Dx\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--术后诊断-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--术后诊断编码-->\n" +
                        "              <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术后诊断编码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" displayName=\""+ cdaData.getCustomCol("DE05_01_024_00_NAME") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "手术过程描述章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8724-7\" displayName=\"Surgical operation note description\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <!--手术过程描述-->\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.063.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术过程描述\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_063_00") + "</value>\n" +
                        "              <!--手术目标部位名称 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.187.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术目标部位名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_187_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!--介入物名称 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE08.50.037.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"介入物名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_037_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!--手术体位代码 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.260.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术体位代码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_260_00") + "\" displayName=\"仰卧位\" codeSystem=\"2.16.156.10011.2.3.1.262\" codeSystemName=\"手术体位代码表\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!--皮肤消毒描述-->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE08.50.057.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"皮肤消毒描述\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_057_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!--手术切口描述-->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.321.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术切口描述\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_321_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!--引流标志-->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.10.165.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"引流标志\"/>\n" +
                        "                  <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE05_10_165_00") + "\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "引流章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11537-8\" displayName=\"Surgical drains\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--引流标志-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--引流标志-->\n" +
                        "              <code code=\"DE05.10.165.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"引流标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE05_10_165_00") + "\"/>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE08.50.044.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"引流材料名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_044_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE08.50.045.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"引流材料数目\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_045_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.341.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"放置部位\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_341_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
