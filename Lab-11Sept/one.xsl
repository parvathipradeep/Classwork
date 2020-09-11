<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<style>
    table {
      border-collapse: collapse;
      width: 100%;
    }

    th, td {
      padding: 8px;
      text-align: left;
      border-bottom: 1px solid #ddd;
    }
</style>
<body>
    <table border="1">
    <tr>
      <th >Region</th>
      <th >Location</th>
      <th >Feature type</th>
      <th >ROV Dives</th>
      <th >Area Covered (ha)</th>
      <th >Depth range surveyed(m)</th>
      <th >Distance from land(km)</th>
      <th >Shipping activity proxy</th>
      <th >Items(ha^-1)</th>
    </tr>
    <xsl:for-each select="survey/isro">
    <tr>
        <td><xsl:value-of select="region" /></td>
        <td><xsl:value-of select="location" /></td>
        <td><xsl:value-of select="feature" /></td>
        <td><xsl:value-of select="rov" /></td>
        <td><xsl:value-of select="area" /></td>
        <td><xsl:value-of select="depth" /></td>
        <td><xsl:value-of select="dist" /></td>
        <td><xsl:value-of select="ship" /></td>
        <td><xsl:value-of select="items" /></td>
    </tr>
    </xsl:for-each>
    </table>
    </body>
    </html>
</xsl:template>
</xsl:stylesheet>